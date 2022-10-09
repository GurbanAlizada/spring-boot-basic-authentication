package com.example.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@EqualsAndHashCode

@NoArgsConstructor
public class AccountDto {


    private String id;
    private BigDecimal balance ;
    private LocalDateTime creatitionTime;
    private AccountCustomerDto accountCustomerDto;
    private List<TransactionDto> transactionDtoSet;

}
