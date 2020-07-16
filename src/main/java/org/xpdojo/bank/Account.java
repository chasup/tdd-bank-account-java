package org.xpdojo.bank;

public class Account {

  public int balance;

  public int getBalance() {
    return balance;
  }

  public void deposit(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
    balance += amount;
  }

}
