package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class CustomerAccountDto {


    private String id;
    private BigDecimal balance = BigDecimal.ZERO;
    private List<TransactionDto> transactionDtoSet;
    private LocalDateTime creationDate;


}
