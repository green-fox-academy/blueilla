package com.greenfox.programmerfoxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("")
  public String showIndexPage(@RequestParam(value = "name", required = false) String username, Model model) {
    model.addAttribute("username", username);
    return "index";
  }

//  @PostMapping("/login")
//  public String login(@ModelAttribute(value = "username") String username){
//    return "";
//
//  }

  @GetMapping("/login")
  public String showLoginPage(){
    return "login";
  }

}
