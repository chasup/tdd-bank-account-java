package org.xpdojo.bank;

public class Account {

  public int balance;

  public Account() {
    balance = 0;
  }

  public Account(int initialBalance) {
    if (initialBalance < 0) {
      throw new IllegalArgumentException();
    }
    balance = initialBalance;
  }

  public int getBalance() {
    return balance;
  }

  public void deposit(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
    balance += amount;
  }

  public void withdraw(int amount) {
    if (amount > balance) {
      throw new IllegalArgumentException();
    }
    balance -= amount;
  }

}
