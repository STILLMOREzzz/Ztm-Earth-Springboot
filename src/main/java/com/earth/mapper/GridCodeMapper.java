package com.earth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.earth.domain.GridCode;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface GridCodeMapper extends BaseMapper<GridCode> {
    @Select("select * from code where array_to_string(grid_code, ',') like '%${gridCode}%'")
    List<Map<String, Object>> selectByCode(@Param("gridCode") String gridCode);
}
