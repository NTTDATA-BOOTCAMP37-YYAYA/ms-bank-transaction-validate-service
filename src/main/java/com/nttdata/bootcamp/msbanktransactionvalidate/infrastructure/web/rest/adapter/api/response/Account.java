package com.nttdata.bootcamp.msbanktransactionvalidate.infrastructure.web.rest.adapter.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**.*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
  
  private String accountId;
  private String accountNumber;
  private String customerId;
  private String productId;
  private String customerTypeId;
  private String customerCategoryId;
  private String accountCurrencyType;
  private String accountDayMovement;
  private String accountState;
  private String accountCreateDate;

  
}
