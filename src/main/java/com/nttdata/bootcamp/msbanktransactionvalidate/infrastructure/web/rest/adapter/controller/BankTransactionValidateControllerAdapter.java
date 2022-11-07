package com.nttdata.bootcamp.msbanktransactionvalidate.infrastructure.web.rest.adapter.controller;


import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.msbanktransactionvalidate.domain.model.BankTransactionValidate;
import com.nttdata.bootcamp.msbanktransactionvalidate.infrastructure.web.rest.adapter.controller.response.ResponseBankValidate;

import reactor.core.publisher.Mono;

/**.*/
@RestController
@RequestMapping("/bankTransactionValidate")
public class BankTransactionValidateControllerAdapter {

  final Logger logger = LoggerFactory.getLogger(BankTransactionValidateControllerAdapter.class);

  /**.*/
  @GetMapping
  public Mono<ResponseEntity<ResponseBankValidate>> validate(@RequestBody BankTransactionValidate validateTransaction) {
    return    Mono.just(new ResponseEntity<ResponseBankValidate>(
                 new ResponseBankValidate(HttpStatus.SC_OK, Boolean.TRUE, "Validate Bank transaction"),
                 null, HttpStatus.SC_OK));
  
  }
 
  

}
