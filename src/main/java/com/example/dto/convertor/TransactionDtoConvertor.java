package com.example.dto.convertor;

import com.example.dto.TransactionDto;
import com.example.model.Transaction;
import org.springframework.stereotype.Component;


@Component
public class TransactionDtoConvertor {


    public TransactionDto convertToTransactionDto(Transaction transaction1){
        return new TransactionDto(
                transaction1.getId(),
                transaction1.getAmount(),
                transaction1.getTransactionType(),
                transaction1.getTransactionDate()
        );
    }



}
