package com.nttdata.bootcamp.msbanktransactionvalidate.application.outgoing;

import com.nttdata.bootcamp.msbanktransactionvalidate.infrastructure.web.rest.adapter.api.response.Account;

import reactor.core.publisher.Mono;

public interface FindAccountByNumberPort {


	  Mono<Account> findAccountByNumber(String accountNumber);
}
