package com.wowo.entity;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {
    //总数据
    private Long total;
    //总页数
    private Integer totalPage;
    //查询出来的集合
    private List<T> items;
    public PageResult(Long total,List<T> items){
        this.total=total;
        this.items=items;
    }

    public PageResult() {
    }

    public PageResult(Long total, Integer totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }
}