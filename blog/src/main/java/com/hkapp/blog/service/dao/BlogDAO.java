package com.hkapp.blog.service.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.hkapp.blog.model.Blog;

@Service
public class BlogDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public List<Blog> findAll() {
        String query = "SELECT id, title from blog";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query);
        List<Blog> list = new ArrayList<>();
        while(result.next()){
            Blog blog = new Blog(result.getString("id"), result.getString("title"));
            list.add(blog);
        }
        return list;
    }
    public int set(String title) {
        String sql = "INSERT INTO blog (title) VALUES (?)";
        int result = jdbcTemplate.update(sql, title);
        return result;
    }
    public Blog findById(String id){
        Blog blog = new Blog();
        String query = "SELECT id, title from blog where id = ?";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query, id);
        while(result.next()){
            blog = new Blog(result.getString("id"), result.getString("title"));
        }
        return blog;
    }
    public Blog findByTitle(String title){
        Blog blog = new Blog();
        String query = "SELECT id, title from blog where title = ?";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query, title);
        while(result.next()){
            blog.setId(result.getString("id"));
            blog.setTitle(result.getString("title"));
        }
        return blog;
    }
}
