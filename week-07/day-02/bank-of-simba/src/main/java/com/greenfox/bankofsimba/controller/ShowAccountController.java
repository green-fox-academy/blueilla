package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowAccountController {

@RequestMapping("/show")
  public String showIndexPage(Model model) {
  model.addAttribute("bankAccount", new BankAccount("Simba", 2000, "lion"));
  return "show";
  }

  @RequestMapping("/index")
  public String showHtmlception(Model model) {
  model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
  return "index";

  }
}
