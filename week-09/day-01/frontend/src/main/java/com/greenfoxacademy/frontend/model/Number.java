package com.greenfoxacademy.frontend.model;

public class Number implements ExerciseInterface{

  private int until;

  public Number() {
  }

  public Number(int until) {
    this.until = until;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }
}
