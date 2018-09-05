package cn.edu.zua.demo.controller;

import cn.edu.zua.demo.controller.test.DemoProperties;
import cn.edu.zua.demo.entity.domain.UserInfoDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

    private DemoProperties demoProperties;

    @Autowired
    public void setDemoProperties(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

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

    @RequestMapping(path = "/getAuthor")
    public DemoProperties getAuthor() {
        LOG.debug("这是我故意打印的日志");
        System.out.println(demoProperties.toString());
        return demoProperties;
    }
}
