package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.*;
import com.greenfoxacademy.frontend.model.Error;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {


  @GetMapping("/doubling")
  public ExerciseInterface doublingNumber(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      Doubling doubling = new Doubling(input, input * 2);
      return doubling;
    } else {
      Error error = new Error();
      return error;
    }
  }

  @GetMapping("/greeter")
  public ExerciseInterface greeterFunction(@RequestParam(value = "name", required = false) String name,
                                           @RequestParam(value = "title", required = false) String title) {
    if (name != null && title != null) {
      WelcomeMessage welcomeMessage = new WelcomeMessage(name, title);
      return welcomeMessage;
    } else if (name == null) {
      return new Error("Please provide a name!");
    }
    return new Error("Please provide a title!");
  }

  @GetMapping("/appenda/{appendable}")
  public ExerciseInterface appendA(@PathVariable (value = "appendable", required = false) String appendable) {
    Append append = new Append(appendable);
    return append;
  }
}
