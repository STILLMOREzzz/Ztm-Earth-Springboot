package com.earth.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.earth.domain.GridCode;
import com.earth.mapper.GridCodeMapper;
import com.earth.service.GridCodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class GridCodeServiceImpl extends ServiceImpl<GridCodeMapper, GridCode> implements GridCodeService {
    @Resource
    GridCodeMapper gridCodeMapper;
    @Override
    public List<Map<String, Object>> selectByCode(String gridCode) {
        return gridCodeMapper.selectByCode(gridCode);
    }
}
