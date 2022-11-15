package com.earth.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.earth.domain.ChengBao;
import com.earth.service.ChengBaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ChengBaoController {

    @Resource
    private ChengBaoService ChengBaoService;

    /**
     * 获取cheng_bao表中的所有数据
     * @return cheng_bao的json数组
     */
    @GetMapping("/getChengBao")
    public List<ChengBao> getAllChengBao(){
        // QueryWrapper queryWrapper = new QueryWrapper<>();
        // queryWrapper.eq("height", 0.000000);
        List<ChengBao> chengBaos = ChengBaoService.list();
        System.out.println(chengBaos);
        return chengBaos;
    }
}
