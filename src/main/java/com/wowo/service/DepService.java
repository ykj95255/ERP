package com.wowo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wowo.entity.Dep;
import com.wowo.entity.PageResult;
import com.wowo.mapper.DepMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class DepService {
    @Autowired
    private DepMapper depMapper;

    /**
     * 查询所有
     * @return
     */
    public List<Dep> findAll(){
        return depMapper.selectAll();
    }
    /**
     * 条件查询
     */
    public List<Dep> findByCondition(String name, String tele){
        Example example = new Example(Dep.class);
        Example.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(name)){
            criteria.andLike("name","%"+ name +"%");
        }
        if(StringUtils.isNotBlank(tele)){
            criteria.andLike("tele","%"+ tele +"%");
        }
        List<Dep> deps = depMapper.selectByExample(example);
        return deps;
    }

    /**
     * 新增部门
     * @param dep
     */
    public void addDep(Dep dep){
        depMapper.insert(dep);
    }





}
