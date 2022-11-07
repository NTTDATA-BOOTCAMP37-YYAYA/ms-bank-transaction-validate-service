package com.nttdata.bootcamp.msbanktransactionvalidate.application.incoming;

import com.nttdata.bootcamp.msbanktransactionvalidate.domain.model.BankTransactionValidate;

import reactor.core.publisher.Mono;

public interface TransactionValidateUseCase {


	Mono<Boolean> validate(BankTransactionValidate validateTransaction);

	
}
