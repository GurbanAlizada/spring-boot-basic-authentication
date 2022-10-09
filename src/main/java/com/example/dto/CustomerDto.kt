package com.example.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class CustomerDto {

    private String id;
    private String name;
    private String surname;
    private List<CustomerAccountDto> accountSet;

}