package com.greenfox.programmerfoxclub.controller;

import com.greenfox.programmerfoxclub.model.Fox;
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

  @GetMapping("/")
  public String showIndexPage() {
    return "login";
  }

  @PostMapping("/login")
  public String showNewFoxPage(@RequestParam(value = "username") String username) {
    foxService.login(username);
    return "redirect:/login/" + username;
  }

  @GetMapping("login/{username}")
  public String showProfilePage(@PathVariable(value = "username") String username, Model model) {
    model.addAttribute("fox", foxService.getFox(username));
    return "index";
  }

  @GetMapping("login/{username}/nutrition-store")
  public String showNutritionStore(@PathVariable(value = "username") String username, Model model) {
    model.addAttribute("fox", foxService.getFox(username));
    return "nutrition-store";
  }
}
