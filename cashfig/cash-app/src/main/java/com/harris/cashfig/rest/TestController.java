package com.harris.cashfig.rest;


import com.harris.cashfig.config.GitAutoRefreshConfig;
import com.harris.cashfig.config.GitConfig;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@RefreshScope
public class TestController {
//    https://www.cnblogs.com/fengzheng/p/11242128.html
    private static Logger logger = Logger.getLogger(TestController.class);

    @Value("${test.msg}")
    public String port;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {

        System.out.println("========hello==========hello======++>>>>>>>>>>>>" + port);
        return port + "1:TestController" + name;
    }

    @Autowired
    private GitConfig gitConfig;

    @Autowired
    private GitAutoRefreshConfig gitAutoRefreshConfig;

    @GetMapping(value = "show")
    public Object show() {
        return gitConfig;
    }

    @GetMapping(value = "autoShow")
    public Object autoShow() {
        return gitAutoRefreshConfig;
    }

}