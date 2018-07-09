package com.greenfoxacademy.frontend.model;

public class Result implements ExerciseInterface {

  private int result;

  public Result() {
  }

  public Result(int result) {
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
