package com.example.dto.convertor;

import com.example.dto.AccountCustomerDto;
import com.example.model.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class AccountCustomerDtoConvertor {


    public AccountCustomerDto convertToAccountCustomerDto(Customer customer1){
        return new AccountCustomerDto(
                customer1.getId(),
                customer1.getName(),
                customer1.getSurname());
    }


}
