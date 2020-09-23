package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Name;
import com.example.demo.repository.NameRepository;

@RestController
public class HelloController {

    @Autowired
    NameRepository repository;

    @GetMapping("/")
    public String index() {
        return "Hello Spring MySQL on Docker";
    }

    @GetMapping(value = "/say/{name}")
    public String say(@PathVariable String name) {
        return "Hello " + name + " !";
    }

    @GetMapping(value="/names")
    public Iterable<Name> getMethodName() {
        return repository.findAll();
    }
}
