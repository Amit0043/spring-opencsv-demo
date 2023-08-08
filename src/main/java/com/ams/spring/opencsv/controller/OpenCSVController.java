package com.ams.spring.opencsv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenCSVController {
    @GetMapping
    public String getData(){
        return "data";
    }
}
