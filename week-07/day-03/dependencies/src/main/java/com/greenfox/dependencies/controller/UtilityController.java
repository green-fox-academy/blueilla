package com.greenfox.dependencies.controller;

import com.greenfox.dependencies.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
