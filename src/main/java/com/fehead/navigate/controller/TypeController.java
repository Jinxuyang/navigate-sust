package com.fehead.navigate.controller;

import com.fehead.navigate.dao.TypeMapper;
import com.fehead.lang.controller.BaseController;
import com.fehead.lang.response.CommonReturnType;
import com.fehead.lang.response.FeheadResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lmwis
 * @description:
 * @date 2019-09-01 19:58
 * @Version 1.0
 */

@RestController
@RequestMapping
public class TypeController extends BaseController {

    @Autowired
    TypeMapper typeMapper;

    /**
     * 获取所有
     * @return
     */
    @GetMapping("/type/list")
    public FeheadResponse pointList(){

        return CommonReturnType.create(typeMapper.selectList(null));
    }

    /**
     * 根据name查询
     * @param name
     * @return
     */
    @GetMapping("/type/{name}")
    public FeheadResponse poiLikeName(@PathVariable("name")String name){


        return CommonReturnType.create(typeMapper.selectByName(name));
    }


}
