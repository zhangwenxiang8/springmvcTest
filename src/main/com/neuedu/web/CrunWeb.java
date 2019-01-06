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
        return "list";
    }

    @RequestMapping("/delete.do")
    public String delete(Integer id){
       service.delete(id);
       return "redirect:list.do";
    }
}
