package cn.edu.zua.demo.controller.test;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * DemoProperties
 *
 * @author adeng
 * @date 2018/9/5 14:19.
 */
@Component
public class DemoProperties {
    @Value("${demo.author}")
    private String author;

    @Value("${demo.author.age}")
    private Integer age;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
