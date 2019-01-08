package com.neuedu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller   //控制层注释
public class WebTest {

    /*@RequestMapping 是 Spring Web 应用程序中最常被用到的注解之一。这个注解会将
     HTTP 请求映射到 MVC 和 REST 控制器的处理方法上。 */
//    @RequestMapping("/a.do")
//    public String web(ModelMap map){                /*map kv值包装传值用法*/
//        map.put("a","map test");
//        return "a";
//    }



//    @RequestMapping("/a.do")
//    public String web(){
//        return "redirect:b.do";
//        //重定向
//    }

    @RequestMapping("/b.do")
    public String web1(@RequestParam("name") String a, String pwd){
        /*@RequestParam  修改回正确的name接收值*/
        System.out.println(a+""+pwd);
        return "";
    }



    @RequestMapping(value="/a.do",params={"a","!b"})
                                /*  params  必须在域名后面加上值才行, !值 =不需要加上*/
    public String web2(String a,String b){
        System.out.println(a+"   " + b);
        return "a";
    }
}
