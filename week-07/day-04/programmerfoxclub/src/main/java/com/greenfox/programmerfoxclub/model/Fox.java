package com.greenfox.programmerfoxclub.model;

import java.util.ArrayList;

public class Fox {

  private String name;
  private ArrayList<String> foods;
  private ArrayList<String> drinks;
  private ArrayList<String> tricks;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
    this.foods = new ArrayList<>();
    this.drinks = new ArrayList<>();
    this.tricks = new ArrayList<>();
  }
}
