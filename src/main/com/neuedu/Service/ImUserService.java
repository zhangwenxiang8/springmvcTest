package com.neuedu.Service;

import com.neuedu.dao.ImUserDao;
import com.neuedu.dao.UserDao;
import com.neuedu.pojo.User;

import java.util.List;

public class ImUserService implements UserService {
    UserDao userDao=new ImUserDao();

    @Override
    public List<User> lists() {
        return userDao.lists();
    }

    @Override
    public User getone(Integer id) {
        return userDao.getone(id);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int delete(Integer id) {
        return userDao.delete(id);
    }
}
