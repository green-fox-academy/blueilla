package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

  @GetMapping("/rest/docker")
  public String helloDocker() {
    return "Hello Docker!";
    }
}
