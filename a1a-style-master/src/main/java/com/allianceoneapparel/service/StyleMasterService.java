package com.allianceoneapparel.service;

import com.allianceoneapparel.Helper.HeaderTableHelper;
import com.allianceoneapparel.Helper.StatusHelper;
import com.allianceoneapparel.Helper.XmlCreateHelper;
import com.allianceoneapparel.core.common.ResponseAPI;
import com.allianceoneapparel.entity.*;
import com.allianceoneapparel.model.Contents;
import com.allianceoneapparel.model.StyleMasterDetailsRoot;
import com.allianceoneapparel.model.TableResponse;
import com.allianceoneapparel.model.TableResponseNon;
import com.allianceoneapparel.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StyleMasterService {
    private final StyleMasterRepository styleMasterRepository;
    private final StyleMasterDetailRepository styleMasterDetailRepository;
    private final ColumnRepository columnRepository;
    private final SearchBodyOverViewRepository searchOverView;
    private final StyleMasterInsertRepository styleMasterInsert;

    private static final Logger logger = LoggerFactory.getLogger(StyleMaster.class);

    @Cacheable(value = "styleMasterByPage", key = "{#pageNumber,#pageSize,#pCustomerCode}")
    @Transactional(readOnly = true)
    public ResponseAPI<?> getStyleMasterByPage(Integer pageNumber, Integer pageSize, String pCustomerCode) {
        var content = styleMasterRepository.getOverview(pageNumber, pageSize, pCustomerCode);
        HeaderTableHelper<StyleMaster> headerTableHelper = new HeaderTableHelper<>();
        var headers = headerTableHelper.getHeaders(new StyleMaster());
        Contents contentsList = new Contents(
                pageNumber,
                pageSize,
                content.getFirst().getTotalRowNum(),
                content.getFirst().getTotalRowNum() / pageSize,
                content
        );
        return new ResponseAPI<>(200, null, new TableResponse(headers, contentsList));
    }

    @Cacheable(value = "styleMasterDetail", key = "{#styleMasterId}")
    @Transactional(readOnly = true)
    public ResponseAPI<?> getStyleMasterDetailByStyleMasterId(Integer styleMasterId) {
        var content = styleMasterDetailRepository.getDetailByStyleMasterId(styleMasterId);
        HeaderTableHelper<StyleMasterDetail> headerTableHelper = new HeaderTableHelper<>();
        var headers = headerTableHelper.getHeaders(new StyleMasterDetail());
        return new ResponseAPI<>(200, null, new TableResponseNon(headers, content));
    }

        @Cacheable(value = "styleMasterFilter", key = "{#pCustomerCode}")
    @Transactional(readOnly = true)
    public ResponseAPI<?> getFilterList(String pCustomerCode) {
        var content = columnRepository.getFilterList(pCustomerCode);
        HeaderTableHelper<Columns> headerTableHelper = new HeaderTableHelper<>();
        var headers = headerTableHelper.getHeaders(new Columns());
        return new ResponseAPI<>(200, null, new TableResponseNon(headers, content));
    }

    @Cacheable(value = "styleMasterSearchOverView", key = "{#searchBodyOverView}")
    @Transactional(readOnly = true)
    public ResponseAPI<?> searchOverView(SearchBodyOverView searchBodyOverView) {
        try {
            var content = searchOverView.searchOverView(
                    searchBodyOverView.getPStyleMasterCode(),
                    searchBodyOverView.getPSeason(),
                    searchBodyOverView.getPStage(),
                    searchBodyOverView.getPCustomerCode(),
                    searchBodyOverView.getPProductType(),
                    searchBodyOverView.getPFactoryAllocation(),
                    searchBodyOverView.getPMerAccountName(),
                    searchBodyOverView.getPFromDate(),
                    searchBodyOverView.getPToDate(),
                    searchBodyOverView.getPPageIndex(),
                    searchBodyOverView.getPPageSize());
            HeaderTableHelper<StyleMaster> headerTableHelper = new HeaderTableHelper<>();
            var headers = headerTableHelper.getHeaders(new StyleMaster());
            Contents contentList = new Contents(searchBodyOverView.getPPageIndex(),
                    searchBodyOverView.getPPageSize(),
                    content.getFirst().getTotalRowNum(),
                    content.getFirst().getTotalRowNum() / searchBodyOverView.getPPageSize(),
                    content);
            return new ResponseAPI<>(200, null, new TableResponse(headers, contentList));
        } catch (Exception exception) {
            return new ResponseAPI<>(200, "No have data", null);
        }
    }

    @SneakyThrows
    @Transactional(readOnly = true)
    public ResponseAPI<?> configData(List<StyleMasterRow> pJSonStyleMaster,
                                     Integer pAction,
                                     Integer pCreatedBy,
                                     Integer pOutput) {
        XmlCreateHelper<StyleMasterRow> xmlCreateHelper = new XmlCreateHelper<>();
        StyleMasterDetailsRoot root = new StyleMasterDetailsRoot();
        root.setRows(pJSonStyleMaster);
        var status = styleMasterInsert.configData(xmlCreateHelper.convertToXml(root), pAction, pCreatedBy, pOutput);
        StatusHelper statusHelper = new StatusHelper();
        return new ResponseAPI<>(200, statusHelper.responseHelper(status, pAction), null);
    }
}
