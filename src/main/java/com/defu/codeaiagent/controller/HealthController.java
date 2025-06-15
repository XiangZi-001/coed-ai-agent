package com.defu.codeaiagent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    /**
     * 测试 knife4j 是否引入成功
     * @return
     */
    @GetMapping
    public String healthController(){
        return "OK";
    }

}
