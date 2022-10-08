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


    @Column(name = "amount")
    val amount : BigDecimal ?,


    @Column(name = "transaction_type")
    @Enumerated(EnumType.STRING)
    val transactionType : TransactionType  = TransactionType.INITIAL ,


    @Column(name = "transaction_date")
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
