package com.allianceoneapparel;

import com.allianceoneapparel.core.common.ResponseAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/test")
@RequiredArgsConstructor
@CrossOrigin(originPatterns = "*")
public class StyleMasterController {
    @PostMapping
    public ResponseAPI<String> stringTest(@RequestParam String t) {
        return new ResponseAPI<>(200, "", t);
    }
}
