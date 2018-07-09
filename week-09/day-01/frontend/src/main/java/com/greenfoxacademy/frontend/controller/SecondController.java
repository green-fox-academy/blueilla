package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.*;
import com.greenfoxacademy.frontend.model.Number;
import com.greenfoxacademy.frontend.model.Error;
import org.springframework.web.bind.annotation.*;


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
  public ExerciseInterface appendA(@PathVariable(value = "appendable", required = false) String appendable) {
    Append append = new Append(appendable);
    return append;
  }

  @PostMapping("/dountil/{what}")
  public ExerciseInterface doUntil(@PathVariable(value = "what") String what, @RequestBody Number number) {
    if (what.equals("sum")) {
      return new Result(numberAdder(number.getUntil()));

    } else if (what.equals("factor")) {
      return new Result(refactorio(number.getUntil()));
    }
    return new Error("Please provide a number!");
  }

  private static int numberAdder(int limit) {
    if (limit == 1) {
      return 1;
    } else {
      return limit + numberAdder(limit - 1);
    }
  }

  private static int refactorio(int n) {
    if (n == 0){
      return 1;
    }
    return n * refactorio(n - 1);
  }
}
