package com.example.dto.convertor;


import com.example.dto.AccountDto;
import com.example.model.Account;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class AccountDtoConvertor {


    private final AccountCustomerDtoConvertor accountCustomerDtoConvertor;

    private final TransactionDtoConvertor transactionDtoConvertor;


    public AccountDtoConvertor(AccountCustomerDtoConvertor accountCustomerDtoConvertor, TransactionDtoConvertor transactionDtoConvertor) {
        this.accountCustomerDtoConvertor = accountCustomerDtoConvertor;
        this.transactionDtoConvertor = transactionDtoConvertor;
    }

    public AccountDto convertToAccountDto(Account account1){
        return new AccountDto(
                account1.getId(),
                account1.getBalance(),
                account1.getCreationDate(),
                accountCustomerDtoConvertor.convertToAccountCustomerDto(account1.getCustomer()),
                account1.getTransactions().stream()
                        .map(n-> transactionDtoConvertor.convertToTransactionDto(n))
                        .collect(Collectors.toList())
        );

    }



}
