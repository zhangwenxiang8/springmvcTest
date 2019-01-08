package com.neuedu.usertest;

import com.neuedu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class UserTest {
    @Test
        public void test(){   //ClassPathXmlApplicationContext读取路径里的文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("config/xyz.xml");
 /*Spring有两个核心接口：BeanFactory和ApplicationContext，其中ApplicationContext是BeanFactory的子接口。
    他们都可代表Spring容器，Spring容器是生成Bean实例的工厂，并且管理容器中的Bean。
        ApplicationContext下的几个方法分别是获取到Bean里的值*/
        InternalResourceViewResolver u =  (InternalResourceViewResolver) ac.getBean("章文翔");
                                                                            //此处的getBean获取的是视图流Bean
        System.out.println(u);
    }


    @Test
    public void test1(){
        ApplicationContext ap=new ClassPathXmlApplicationContext("config/xyz.xml");
       User u =(User) ap.getBean("user");
       System.out.println(u);
    }
}
