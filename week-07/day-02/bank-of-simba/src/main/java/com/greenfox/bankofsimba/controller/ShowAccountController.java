package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowAccountController {

  private List<BankAccount> accounts = new ArrayList<>();


  public List<BankAccount> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<BankAccount> accounts) {
    this.accounts = accounts;
  }

  @RequestMapping("/show")
  public String showIndexPage(Model model) {
  model.addAttribute("bankAccount", new BankAccount("Simba", 2000, "lion"));
  return "show";
  }

  @RequestMapping("/test")
  public String showHtmlception(Model model) {
  model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
  return "test";
  }

  @RequestMapping("/list-of-accounts")
  public String showBankAccountList(Model model) {
    model.addAttribute("accounts", accounts);
    accounts.add(new BankAccount("Mufasa", 5000, "lion"));
    accounts.add(new BankAccount("Simba", 7000, "lion"));
    accounts.add(new BankAccount("Zordon", 3000, "lion"));
    accounts.add(new BankAccount("Timon", 1000, "meerkat"));
    accounts.add(new BankAccount("Pumba", 1000, "warthog"));
    accounts.add(new BankAccount("Nala", 4000, "lion"));

    return "list-of-accounts";
  }

}
