package com.nttdata.bootcamp.msbanktransactionvalidate.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankTransactionValidate {

	private String transactionSourceAccount;
	private String transactionDestinyAccount;
	private double transactionAmount;
	private boolean validateSourceAccount;
	private boolean validateDestinyAccount;
}
