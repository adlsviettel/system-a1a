package com.allianceoneapparel.service;

import com.allianceoneapparel.HeaderTableHelper;
import com.allianceoneapparel.core.common.ResponseAPI;
import com.allianceoneapparel.entity.Columns;
import com.allianceoneapparel.entity.StyleMaster;
import com.allianceoneapparel.entity.StyleMasterDetail;
import com.allianceoneapparel.model.Contents;
import com.allianceoneapparel.model.TableResponse;
import com.allianceoneapparel.model.TableResponseNon;
import com.allianceoneapparel.repository.ColumnRepository;
import com.allianceoneapparel.repository.StyleMasterDetailRepository;
import com.allianceoneapparel.repository.StyleMasterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StyleMasterService {
    private final StyleMasterRepository styleMasterRepository;
    private final StyleMasterDetailRepository styleMasterDetailRepository;
    private final ColumnRepository columnRepository;

//    @Cacheable(value = "styleMasterByPage", key = "{#pageNumber,#pageSize,#pCustomerCode}")
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

//    @Cacheable(value = "styleMasterDetail", key = "{#styleMasterId}")
    @Transactional(readOnly = true)
    public ResponseAPI<?> getStyleMasterDetailByStyleMasterId(Integer styleMasterId) {
        var content = styleMasterDetailRepository.getDetailByStyleMasterId(styleMasterId);
        HeaderTableHelper<StyleMasterDetail> headerTableHelper = new HeaderTableHelper<>();
        var headers = headerTableHelper.getHeaders(new StyleMasterDetail());
        return new ResponseAPI<>(200, null, new TableResponseNon(headers, content));
    }

//    @Cacheable(value = "styleMasterFilter", key = "{#pCustomerCode}")
    @Transactional(readOnly = true)
    public ResponseAPI<?> getFilterList(String pCustomerCode) {
        var content = columnRepository.getFilterList(pCustomerCode);
        HeaderTableHelper<Columns> headerTableHelper = new HeaderTableHelper<>();
        var headers = headerTableHelper.getHeaders(new Columns());
        return new ResponseAPI<>(200, null, new TableResponseNon(headers, content));
    }
}
