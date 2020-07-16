package org.xpdojo.bank;

public class Account {

  public int balance;

  public int getBalance() {
    return balance;
  }

  public void deposit(int amount) {
    balance += amount;
  }

}
