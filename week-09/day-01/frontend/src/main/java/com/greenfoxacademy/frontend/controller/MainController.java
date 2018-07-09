package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.*;
import com.greenfoxacademy.frontend.model.Error;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {


  @GetMapping("/")
  public String renderIndexPage() {
    return "index";
  }

  @GetMapping("/doubling")
  @ResponseBody
  public FrontendInterface doublingNumber(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      Doubling doubling = new Doubling(input, input * 2);
      return doubling;
    } else {
      Error error = new Error();
      return error;
    }
  }

  @GetMapping("/greeter")
  @ResponseBody
  public FrontendInterface greeterFunction(@RequestParam(value = "name", required = false) String name,
                                           @RequestParam(value = "title", required = false) String title) {
    WelcomeMessage welcomeMessage = new WelcomeMessage(name, title);
    return welcomeMessage;

  }


}

