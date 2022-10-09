package com.example.model

import com.fasterxml.jackson.annotation.JsonIgnore
import lombok.Builder
import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Account (

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String,


    val balance : BigDecimal? = BigDecimal.ZERO,


    val creationDate : LocalDateTime,


    @ManyToOne(cascade = [CascadeType.PERSIST])
    @JoinColumn(name = "customer_id", nullable = false)
    val customer: Customer ,

    @OneToMany(mappedBy = "account", cascade = [CascadeType.PERSIST])
    @JsonIgnore
    val transactions: List<Transaction>?

){






    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Account

        if (id != other.id) return false
        if (balance != other.balance) return false
        if (creationDate != other.creationDate) return false
        if (customer != other.customer) return false
        if (transactions != other.transactions) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (balance?.hashCode() ?: 0)
        result = 31 * result + creationDate.hashCode()
        result = 31 * result + (customer?.hashCode() ?: 0)
        result = 31 * result + (transactions?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "Account(id=$id, balance=$balance, creationDate=$creationDate, customer=$customer, transactions=$transactions)"
    }


}