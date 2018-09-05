package cn.edu.zua.demo.controller;

import cn.edu.zua.demo.entity.domain.UserInfoDO;
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
    @RequestMapping(path = "/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping(path = "/getUser")
    public UserInfoDO getUser() {
        UserInfoDO user = new UserInfoDO();
        user.setId(1001L);
        user.setUserName("damon");
        user.setPassword("123456");
        user.setRoleName("管理员");
        return user;
    }
}
