package com.example.dto



data class CustomerDto (
     val id: String?,
     val name: String? ,
     val surname: String? ,
     val accountSet: List<CustomerAccountDto>?
    )