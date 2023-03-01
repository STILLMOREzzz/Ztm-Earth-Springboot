package com.earth.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.ArrayTypeHandler;
import org.apache.ibatis.type.JdbcType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("grid_code")
public class GridCode {
    private Integer id;
    private String name;

    @TableField(value = "grid_code",typeHandler = ArrayTypeHandler.class,jdbcType = JdbcType.ARRAY)
    private String[] gridCode;
    private String url;
}
