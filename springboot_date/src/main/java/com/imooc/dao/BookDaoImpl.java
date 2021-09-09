package com.imooc.dao;

import com.imooc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-08 17:47]
 */
@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Book> getBooks() {
        String sql = "select * from t_book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        return books;
    }
}
