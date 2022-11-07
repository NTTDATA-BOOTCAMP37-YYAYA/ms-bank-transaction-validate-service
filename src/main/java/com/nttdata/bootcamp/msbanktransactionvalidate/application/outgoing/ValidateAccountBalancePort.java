package com.nttdata.bootcamp.msbanktransactionvalidate.application.outgoing;

import reactor.core.publisher.Mono;

public interface ValidateAccountBalancePort {

	Mono<Boolean> validateAccountBalance(String accountNumber , double amount );
}
