package org.xpdojo.bank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AccountTest {

  @Test
  public void anAccountHasAnInitialBalanceOfZero() {
    Account account = new Account();
    assertThat(account.getBalance()).isEqualTo(0);
  }

  @Test
  @Disabled
  public void depositAnAmountToIncreaseTheBalance() {
    assertThat("your first test").isBlank();
  }
}
