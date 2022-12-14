package com.nttdata.bootcamp.msbanktransactionvalidate.domain.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**.*/
@AllArgsConstructor
@NoArgsConstructor
public enum States {

  ACTIVE("A"),
  INACTIVE("I");
  
  private String value;

  public String getValue() {
    return value;
  }



}
