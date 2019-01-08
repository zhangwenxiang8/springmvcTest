package com.neuedu.web;

import com.neuedu.Service.ImUserService;
import com.neuedu.Service.UserService;
import com.neuedu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CrunWeb {
    UserService service=new ImUserService();

    @RequestMapping("/list.do")
    public String Lists(ModelMap map){
       List<User> users =service.lists();
        map.put("user",users);
        return "/WEB-INF/list.jsp";
    }

    @RequestMapping("/delete.do")
    public String delete(Integer id){
       service.delete(id);
       return "redirect:list.do";
    }

        @RequestMapping("/add.do")
        public String insert(){
            return "/WEB-INF/insert.jsp";
        }

        @RequestMapping("/insert.do")
    public String add(User user){
      service.insert(user);
            return "redirect:list.do";
    }

    @RequestMapping("/update.do")
    public String update(Integer id,ModelMap map){
       User user =service.getone(id);
       System.out.println(user);
       map.put("user",user);
        return "/WEB-INF/update.jsp";
    }

    @RequestMapping("updateto.do")
    public String updateto(User user){
        service.update(user);

        return "redirect:list.do";
    }
}
