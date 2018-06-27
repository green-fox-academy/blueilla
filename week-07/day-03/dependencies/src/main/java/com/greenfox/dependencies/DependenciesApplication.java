package com.greenfox.dependencies;

import com.greenfox.dependencies.service.MyColor;
import com.greenfox.dependencies.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {

  @Autowired
  Printer printer;

  @Autowired
  MyColor redColor;

  @Autowired
  MyColor greenColor;

  public static void main(String[] args) {
    SpringApplication.run(DependenciesApplication.class, args);

  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("HELLO");
    redColor.printColor();
    greenColor.printColor();

  }
}
