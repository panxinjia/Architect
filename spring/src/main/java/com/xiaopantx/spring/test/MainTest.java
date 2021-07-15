package com.xiaopantx.spring.test;

import com.xiaopantx.spring.entity.User;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaopantx
 */
public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 类型获取Bean
        User user = applicationContext.getBean(User.class);
        String content = ReflectionToStringBuilder.toString(user);
        System.out.println(content);
        System.out.println("------------------------------------------");
        // bean 别名
        String[] aliases = applicationContext.getAliases("user");
        for (String alias : aliases) {

            System.out.println("alias = " + alias);
        }
    }
}
