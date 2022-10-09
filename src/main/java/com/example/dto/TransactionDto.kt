package com.example.dto

import com.example.model.TransactionType;

import java.math.BigDecimal
import java.time.LocalDateTime


data class TransactionDto (
    val id: String?,
    val amount: BigDecimal?,
    val transactionType: TransactionType ,
    val transactionDate: LocalDateTime?
    )