package com.example.dto;


import lombok.*;

@Data
@AllArgsConstructor
@Builder
@EqualsAndHashCode

@NoArgsConstructor
public class AccountCustomerDto {

    private String id;
    private String name;
    private String surname;

}
