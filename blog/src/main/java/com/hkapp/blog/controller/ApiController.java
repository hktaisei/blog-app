package com.hkapp.blog.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hkapp.blog.model.Blog;
import com.hkapp.blog.service.dao.BlogDAO;

@RestController
public class ApiController {
    @Autowired
    private BlogDAO blogDao;

    @GetMapping("/testAPI")
    public List<Blog> testIndex() throws Exception{
        List<Blog> blog = blogDao.findAll();
        return blog;
    }
}