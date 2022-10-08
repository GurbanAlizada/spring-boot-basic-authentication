package com.example.dto.convertor;


import com.example.dto.CustomerDto;
import com.example.model.Customer;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CustomerDtoConvertor {

   private final CustomerAccountDtoConvertor customerAccountDtoConvertor;

    public CustomerDtoConvertor(CustomerAccountDtoConvertor customerAccountDtoConvertor) {
        this.customerAccountDtoConvertor = customerAccountDtoConvertor;
    }

    public CustomerDto convertToCustomerDto(Customer customer1){
        return new CustomerDto(
                customer1.getId(),
                customer1.getName(),
                customer1.getSurname(),
                customer1.getAccounts().stream()
                        .map(n ->customerAccountDtoConvertor.convertToCustomerAccountDto(n))
                        .collect(Collectors.toList())

        );








    }

}
