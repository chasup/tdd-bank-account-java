package org.xpdojo.bank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AccountTest {

  @Test
  public void anAccountHasAnInitialBalanceOfZeroByDefault() {
    Account account = new Account();
    assertThat(account.getBalance()).isEqualTo(0);
  }

  @Test
  public void depositAnAmountToIncreaseTheBalance() {
    Account account = new Account();

    account.deposit(10);
    assertThat(account.getBalance()).isEqualTo(10);

    account.deposit(5);
    assertThat(account.getBalance()).isEqualTo(15);
  }

  @Test
  public void depositingANegativeAmountShouldThrow() {
    Account account = new Account();
    try {
      account.deposit(-10);
      assertThat(account.getBalance()).isEqualTo(0);
    } catch (IllegalArgumentException e) {

    }
  }

}
