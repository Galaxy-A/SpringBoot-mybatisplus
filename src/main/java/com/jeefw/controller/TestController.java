package com.jeefw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenPC
 */
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * 测试
     *
     * @return
     */
    @RequestMapping("/test1")
    public String test1() {
        return "启动成功";
    }
}
