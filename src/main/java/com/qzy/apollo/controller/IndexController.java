package com.qzy.apollo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述
 * @创建人 joy_qiu
 * @创建时间 2020-12-23-17:27
 * @修改人和其它信息
 */
@RestController
public class IndexController {

    @Value("${name_qzy:default}")
    private String doMain;

    @RequestMapping(value = "/index")
    public String index(){
        return doMain;
    }
}
