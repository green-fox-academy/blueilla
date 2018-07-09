package com.greenfoxacademy.frontend.model;

public class WelcomeMessage implements FrontendInterface {

  private String name;
  private String title;
  private String welcome_message;

  public WelcomeMessage(String name, String title) {
    this.welcome_message = "Oh, hi dear " + name + ", my dear " + title + "!";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}