package com.nttdata.bootcamp.msbanktransactionvalidate.infrastructure.web.rest.adapter.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**.*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseAccountBalanceValidate {
  
  private int httpStatus;
  private Boolean validate;
  private String message;

}