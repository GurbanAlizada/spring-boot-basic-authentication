package com.example.dto


import java.math.BigDecimal

import java.time.LocalDateTime


data class CustomerAccountDto (
    val id: String?,
    val balance: BigDecimal = BigDecimal.ZERO,
    val transactionDtoSet: List<TransactionDto>?,
    val creationDate: LocalDateTime?
    )