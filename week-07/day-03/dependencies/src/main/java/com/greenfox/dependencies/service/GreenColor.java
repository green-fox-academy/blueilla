package com.greenfox.dependencies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("It's green!");
  }
}
