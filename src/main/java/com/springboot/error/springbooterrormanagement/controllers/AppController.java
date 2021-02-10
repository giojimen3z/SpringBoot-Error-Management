package com.springboot.error.springbooterrormanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

  @GetMapping("/index")
  public String index() {
    Integer valor = Integer.parseInt("10x");

    return "index";
  }
}
