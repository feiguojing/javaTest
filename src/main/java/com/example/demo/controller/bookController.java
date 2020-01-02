package com.example.demo.controller;

import com.example.demo.model.BookBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookController {
    @GetMapping("/book")
    public String book() {
        BookBean bean = new BookBean();
        bean.setAuthor("罗贯中");
        return bean.toString();
    }
}
