package com.example.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@Entity
data class Customer(

    @Id
    @GeneratedValue(generator = "UUID" )
    @GenericGenerator(name ="UUID" , strategy = "org.hibernate.id.UUIDGenerator")
    var id : String ? ,


    val name : String ? ,

    val surname : String ? ,

    @OneToMany(mappedBy = "customer" /*, fetch = FetchType.EAGER*/)
    @JsonIgnore
    var accounts : List<Account>


){





    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Customer

        if (id != other.id) return false
        if (name != other.name) return false
        if (surname != other.surname) return false
        if (accounts != other.accounts) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + surname.hashCode()
        result = 31 * result + accounts.hashCode()
        return result
    }

    override fun toString(): String {
        return "Customer(id=$id, name=$name, surname='$surname', accounts=$accounts)"
    }
}
