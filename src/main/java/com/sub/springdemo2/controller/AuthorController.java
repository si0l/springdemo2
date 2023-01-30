package com.sub.springdemo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sub.springdemo2.repository.AuthorRepository;

@Controller
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepo;

    @GetMapping("/authors")
    public String getBooks(Model model) {
        model.addAttribute("authors", authorRepo.findAll());
        return "authors/list";
    }
}
