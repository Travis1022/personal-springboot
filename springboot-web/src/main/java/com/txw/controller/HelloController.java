package com.txw.controller;

import com.txw.entity.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @Value("${my.name}")
    private String name;


    @Value("${my.location}")
    private String location;

    @Autowired
    private ConfigInfo configInfo;

    /**
     * 读取自定义配置文件 方法1
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/hello/config")
    @ResponseBody
    public String sayConfigInfo() {
        return name + "————" + location;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/test")
    @ResponseBody
    public String index() {
        return "test";
    }


    /**
     * 读取自定义配置文件 方法2
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "hello/myConfig")
    @ResponseBody
    public String sayConfig() {
        return configInfo.getName() + "----" + configInfo.getLocation();
    }


    @RequestMapping(method = RequestMethod.GET, path = "/hello/sayHello")
    @ResponseBody
    public String sayHello() {
        return "Hello word,Spring boot";
    }

}
