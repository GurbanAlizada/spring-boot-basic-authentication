package com.example.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Account (

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?,


    val balance : BigDecimal? = BigDecimal.ZERO,


    val creationDate : LocalDateTime,


    @ManyToOne(cascade = [CascadeType.PERSIST])
    @JoinColumn(name = "customer_id", nullable = false)
    val customer: Customer ?,

    @OneToMany(mappedBy = "account", cascade = [CascadeType.PERSIST])
    @JsonIgnore
    val transactions: List<Transaction>?

){


    constructor( balance: BigDecimal? , creationDate: LocalDateTime , customer: Customer? , transactions: List<Transaction>?) :
            this(
                "" ,
                balance = balance,
                creationDate = creationDate ,
                customer = customer,
                transactions = transactions
            )


}