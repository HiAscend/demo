package cn.edu.zua.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorldController
 *
 * @author adeng
 * @date 2018/9/4 16:46.
 */
@RestController
public class HelloWorldController {
    @RequestMapping(name = "/hello")
    public String index() {
        return "Hello World";
    }
}
