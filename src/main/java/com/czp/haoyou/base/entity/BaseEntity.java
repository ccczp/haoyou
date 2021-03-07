package com.czp.haoyou.base.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {

    @TableId(type = IdType.ASSIGN_ID)
    private Long Id;

    @TableField(value = "create_date",fill = FieldFill.INSERT)
    Date createDate = new Date();

    @TableField(value = "update_date",fill = FieldFill.INSERT_UPDATE)
    Date updateDate;
}
