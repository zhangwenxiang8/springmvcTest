package com.neuedu.Jdbcutil;
import java.sql.ResultSet;

public interface Ronmap<T>{
    T RowMapping(ResultSet rs);
}
