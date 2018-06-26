package com.greenfox.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private List<BankAccount> accounts;

  public BankAccount() {
  }

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public List<BankAccount> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<BankAccount> accounts) {
    this.accounts = accounts;
  }
}
