package com.novo.demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuqf1@novo.com created on 2022/1/29
 * @version $
 */
@RestController
public class LbController {

    @GetMapping(value = "/internal/helloworld")
    public String helloWorld() {
        return "Hello, welcome to LuBan world!";
    }

}
