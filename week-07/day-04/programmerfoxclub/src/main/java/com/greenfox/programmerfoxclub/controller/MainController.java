package com.greenfox.programmerfoxclub.controller;

import com.greenfox.programmerfoxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("")
  public String showIndexPage(@RequestParam(value = "name", required = false) String username, Model model) {
    model.addAttribute("username", username);
    return "index";
  }

  @GetMapping("/login")
  public String showLoginPage(){
    return "login";
  }

  @GetMapping("login/{username}")
  public String showProfilePage(@PathVariable(value = "username")String username, Model model) {
    model.addAttribute("fox", foxService.getFox(username));
    return "information";
  }

}
