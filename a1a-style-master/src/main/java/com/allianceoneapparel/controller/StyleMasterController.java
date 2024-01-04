package com.allianceoneapparel.controller;

import com.allianceoneapparel.StyleMasterURL;
import com.allianceoneapparel.core.common.ResponseAPI;
import com.allianceoneapparel.entity.SearchBodyOverView;
import com.allianceoneapparel.service.StyleMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(StyleMasterURL.STYLE_MASTER)
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StyleMasterController {
    private final StyleMasterService styleMasterService;

    @GetMapping
    public ResponseAPI<?> getStyleMasterByPage(@RequestParam Integer pPageIndex,
                                               @RequestParam Integer pPageSize,
                                               @RequestParam String pCustomerCode) {
        return styleMasterService.getStyleMasterByPage(pPageIndex, pPageSize, pCustomerCode);
    }

    @GetMapping(StyleMasterURL.STYLE_MASTER_DETAILS)
    public ResponseAPI<?> getStyleMasterDetailByStyleMasterId(@RequestParam Integer pStyleMasterId) {
        return styleMasterService.getStyleMasterDetailByStyleMasterId(pStyleMasterId);
    }

    @GetMapping(StyleMasterURL.STYLE_MASTER_GET_FILTER)
    public ResponseAPI<?> getFilterList(@RequestParam String pCustomerCode) {
        return styleMasterService.getFilterList(pCustomerCode);
    }

    @GetMapping(StyleMasterURL.STYLE_MASTER_SEARCH_OVERVIEW)
    public ResponseAPI<?> searchOverView(SearchBodyOverView searchBodyOverView) {
        return styleMasterService.searchOverView(searchBodyOverView);
    }
}
