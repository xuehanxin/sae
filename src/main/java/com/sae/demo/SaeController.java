package com.sae.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiang.mianyue
 * @create 2021-01-13 10:57
 **/
@RestController
public class SaeController {
    @RequestMapping("/")
    public String index() {
        return "Hello sae!";
    }
}
