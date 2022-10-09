package com.example.dto


import javax.validation.constraints.NotBlank
import java.math.BigDecimal
import javax.validation.constraints.Min


data class CreateAccountRequest (

    @field:NotBlank(message = "CustomerId must not be empty")
    val customerId: String? ,
    @field:Min(0, message = "Initial Credit value must not be negative value")
    val initialCredit: BigDecimal?
)