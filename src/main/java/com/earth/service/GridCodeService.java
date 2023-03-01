package com.earth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.earth.domain.GridCode;

import java.util.List;
import java.util.Map;

public interface GridCodeService extends IService<GridCode> {
    List<Map<String, Object>> selectByCode(String gridCode);
}
