package com.greenfox.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Fox {

  private String name;
  private String food;
  private String drink;
  private ArrayList<String> tricks;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
    food = "caviar";
    drink = "champagne";
    tricks = new ArrayList<>(Arrays.asList("Sleeping all day long"));
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public ArrayList<String> getTricks() {
    return tricks;
  }

  public void setTricks(ArrayList<String> tricks) {
    this.tricks = tricks;
  }
}
