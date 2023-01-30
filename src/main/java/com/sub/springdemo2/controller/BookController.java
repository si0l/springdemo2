package com.sub.springdemo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sub.springdemo2.repository.BookRepository;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepo.findAll());
        return "books/list";
    }
}
