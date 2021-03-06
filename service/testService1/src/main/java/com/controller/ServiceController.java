package com.controller;

import com.bean.RestfulResult;
import com.bean.ServiceInfo;
import com.entity.OrderInfo;
import com.util.CommUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Set;

@RestController // 重要，如果用Controller会404
@RequestMapping(value = "service")
public class ServiceController {
    @RequestMapping(value = "hello")
    public void login(HttpServletRequest request, HttpServletResponse response,
                      @RequestBody ServiceInfo serviceInfo) {

        RestfulResult restfulResult = new RestfulResult();
        try {
            restfulResult.setData("Service1:Welcome " + serviceInfo.getName() + "!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value = "rest")
    public String rest(@RequestBody ServiceInfo serviceInfo){

        return "Service1:Welcome " + serviceInfo.getName() + " !";
    }

    @RequestMapping(value = "feigntest")
    public String feigntest(@RequestBody ServiceInfo serviceInfo){

        return "接口提供方service1";
    }
}