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
        User user = (User) applicationContext.getBean("user");
        User user2 = (User) applicationContext.getBean("user2");
        String content = ReflectionToStringBuilder.toString(user);
        String content2 = ReflectionToStringBuilder.toString(user2);
        System.out.println(content);
        System.out.println(content2);
        System.out.println("------------------------------------------");
        // bean 别名
        String[] aliases = applicationContext.getAliases("user");
        for (String alias : aliases) {

            System.out.println("alias = " + alias);
        }
    }
}
