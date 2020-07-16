package org.xpdojo.bank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AccountTest {

  @Test
  public void anAccountHasAnInitialBalanceOfZero() {
    Account account = new Account();
    assertThat(account.getBalance()).isEqualTo(0);
  }

  @Test
  public void depositAnAmountToIncreaseTheBalance() {
    Account account = new Account();

    account.deposit(10);

    assertThat(account.getBalance()).isEqualTo(10);

  }
}
