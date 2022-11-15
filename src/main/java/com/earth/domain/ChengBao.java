package com.earth.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("cheng_bao")
public class ChengBao {

    private Integer id;
    private String name;
    private String location;
    private String detailLocation;
    private String number;
    private String lng;
    private String lat;
    private String height;
    private String description;

    @TableField(exist = false)
    private Boolean transform;
}
