package com.example.dto

import java.math.BigDecimal
import java.time.LocalDateTime



data class AccountDto (
     val id: String? ,
     val balance: BigDecimal?,
     val creatitionTime: LocalDateTime? ,
     val accountCustomerDto: AccountCustomerDto? ,
     val transactionDtoSet: List<TransactionDto>?
)