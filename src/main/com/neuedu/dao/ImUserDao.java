package com.neuedu.dao;

import com.neuedu.Jdbcutil.JdbcUtil;
import com.neuedu.Jdbcutil.Ronmap;
import com.neuedu.pojo.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ImUserDao implements UserDao {
    @Override
    public List<User> lists() {
        return JdbcUtil.R("select * from user", new Ronmap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User u=new User();
                try {
                    u.setId(rs.getInt("pid"));
                    u.setName(rs.getString("username"));
                    u.setPwd(rs.getString("password"));

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return u;
            }
        }, null);
    }

    @Override
    public User getone(String name) {
      return JdbcUtil.getone("select * from user where name=?", new Ronmap<User>() {
          @Override
          public User RowMapping(ResultSet rs) {
             User user=new User();
              try {
                  user.setName(rs.getString("username"));
                    user.setPwd(rs.getNString("password"));
              } catch (SQLException e) {
                  e.printStackTrace();
              }
              return user;
          }
      },name);
    }

    @Override
    public int update( User user) {
        return JdbcUtil.CUD("update user set username=?,password=? where username=?",user.getName(),user.getPwd());
    }

    @Override
    public int insert( User user) {
        return JdbcUtil.CUD("insert into user(username,password)values(?,?)",user.getName(),user.getPwd());
    }

    @Override
    public int delete(Integer id) {
        return JdbcUtil.CUD("delete from user where pid=?",id);
    }
}
