package com.allianceoneapparel.controller;

import com.allianceoneapparel.StyleMasterURL;
import com.allianceoneapparel.core.common.ResponseAPI;
import com.allianceoneapparel.service.StyleMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(StyleMasterURL.STYLE_MASTER)
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StyleMasterController {
    private final StyleMasterService styleMasterService;

    @PostMapping
    public ResponseAPI<?> getStyleMasterByPage(@RequestParam("pPageIndex") Integer pPageIndex,
                                               @RequestParam("pPageSize") Integer pPageSize,
                                               @RequestParam("pCustomerCode") String pCustomerCode) {
        return styleMasterService.getStyleMasterByPage(pPageIndex, pPageSize, pCustomerCode);
    }

    @PostMapping("/style-details")
    public ResponseAPI<?> getStyleMasterDetailByStyleMasterId(@RequestParam Integer pStyleMasterId) {
        return styleMasterService.getStyleMasterDetailByStyleMasterId(pStyleMasterId);
    }

    @PostMapping("/get-filter")
    public ResponseAPI<?> getFilterList(@RequestParam String pCustomerCode) {
        return styleMasterService.getFilterList(pCustomerCode);
    }
}
