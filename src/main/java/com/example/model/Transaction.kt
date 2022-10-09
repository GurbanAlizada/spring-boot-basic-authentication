package com.example.model

import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*


@Entity
data class Transaction(

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name ="UUID" , strategy = "org.hibernate.id.UUIDGenerator")
    val id : String ,


    val amount : BigDecimal ?,


    @Enumerated(EnumType.STRING)
    val transactionType : TransactionType  = TransactionType.INITIAL ,


    val transactionDate : LocalDateTime ?,

    @ManyToOne /*(fetch = FetchType.LAZY )*/
    @JoinColumn(name = "account_id" , nullable = false)
    val account : Account ?

){
    constructor(amount: BigDecimal, transactionDate: LocalDateTime, account: Account) : this(
        "" ,
        amount = amount,
        transactionDate = transactionDate,
      //  transactionType = TransactionType.INITIAL,
        account = account
    )








}

enum class TransactionType {
    INITIAL, TRANSFER
}
