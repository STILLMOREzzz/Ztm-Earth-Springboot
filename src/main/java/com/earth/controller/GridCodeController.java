package com.earth.controller;

import com.earth.domain.GridCode;
import com.earth.service.GridCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class GridCodeController {

    @Autowired
    private GridCodeService gridCodeService;

    @PostMapping ("/getAllByCode")
    @ResponseBody
    public List<Map<String, Object>> getAllByCode(@RequestBody Map<String, Object> map){
        String code = map.get("code").toString();
        List<Map<String, Object>> gridCodes = gridCodeService.selectByCode(code);
        return gridCodes;
    }
}
