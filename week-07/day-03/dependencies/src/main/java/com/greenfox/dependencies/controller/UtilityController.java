package com.greenfox.dependencies.controller;

import com.greenfox.dependencies.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

  @Autowired
  UtilityService utilityService;

  @RequestMapping("/useful")
  public String showUtilities() {
    return "useful";
  }

  @RequestMapping("useful/colored")
  public String showRandomColoredBackground(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @RequestMapping("useful/email")
  public String showValidateEmail(@RequestParam(value="email") String email, Model model) {
    model.addAttribute("email", utilityService.validateEmail(email));
    model.addAttribute("path", email);
    return "email";
  }
}
