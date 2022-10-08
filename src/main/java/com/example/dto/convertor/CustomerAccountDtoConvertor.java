package com.example.dto.convertor;


import com.example.dto.CustomerAccountDto;
import com.example.model.Account;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CustomerAccountDtoConvertor {

    private  final TransactionDtoConvertor transactionDtoConvertor;

    public CustomerAccountDtoConvertor(TransactionDtoConvertor transactionDtoConvertor) {
        this.transactionDtoConvertor = transactionDtoConvertor;
    }

    public CustomerAccountDto convertToCustomerAccountDto(Account account1){
        return new CustomerAccountDto(
                account1.getId(),
                account1.getBalance(),
                account1.getTransactions().stream()
                        .map(n->transactionDtoConvertor.convertToTransactionDto(n))
                        .collect(Collectors.toList()),
                account1.getCreationDate()
        );
    }

}
