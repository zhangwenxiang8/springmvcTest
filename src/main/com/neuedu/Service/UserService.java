package com.neuedu.Service;

import com.neuedu.pojo.User;

import java.util.List;

public interface UserService {
    List<User> lists();
    User getone(String name);
    int update( User user);
    int insert(User user );
    int delete(Integer id);
}
