package com.junpyo.shopping.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class MainController {

  @RequestMapping(value = {"/", "mainPage"})
  public String mainPage() {
    return "mainPage";
  }
}
