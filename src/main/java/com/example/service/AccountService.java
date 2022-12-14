package com.example.service;

import com.example.dto.AccountDto;
import com.example.dto.CreateAccountRequest;
import com.example.dto.convertor.AccountDtoConvertor;
import com.example.model.Account;
import com.example.model.Customer;
import com.example.model.Transaction;
import com.example.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final CustomerService customerService;
    private final AccountDtoConvertor accountDtoConvertor;

    public AccountService(AccountRepository accountRepository,
                          CustomerService customerService,
                          AccountDtoConvertor accountDtoConvertor) {

        this.accountRepository = accountRepository;
        this.customerService = customerService;
        this.accountDtoConvertor = accountDtoConvertor;
    }

    public AccountDto createAccount(CreateAccountRequest createAccountRequest){

        Customer customer = customerService.findCustomerById(createAccountRequest.getCustomerId());

        Account account = new Account(
                customer ,
                createAccountRequest.getInitialCredit() ,
                LocalDateTime.now()
        );


        if(createAccountRequest.getInitialCredit().compareTo(BigDecimal.ZERO) > 0){

            Transaction transaction = new Transaction(
                    createAccountRequest.getInitialCredit() ,
                    LocalDateTime.now() ,
                    account
            );


                     account.getTransactions().add(transaction);
        }




        return accountDtoConvertor.convertToAccountDto(accountRepository.save(account));
    }






}
