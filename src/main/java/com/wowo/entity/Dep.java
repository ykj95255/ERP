package com.wowo.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@Table(name = "dep")
public class Dep implements Serializable {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long uuid;//编号
    private String name;//部门名称
    private String tele;//联系电话
}
