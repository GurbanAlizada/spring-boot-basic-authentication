package com.example.service;

import com.example.dto.AccountDto;
import com.example.dto.CreateAccountRequest;
import com.example.dto.convertor.AccountDtoConvertor;
import com.example.model.Account;
import com.example.model.Customer;
import com.example.model.Transaction;
import com.example.model.TransactionType;
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
        customerService.findCustomerById(createAccountRequest.getCustomerId());

        Account account1 = new Account(
                null,
                createAccountRequest.getInitialCredit() ,
                LocalDateTime.now(),
                customer,
                null
        );

        if(createAccountRequest.getInitialCredit().compareTo(BigDecimal.ZERO) > 0){
          //Transaction1 transaction1 = transactionService.initiateMoney(account1 , createAccountRequest.getInitialCredit());

            Transaction transaction1 = new Transaction(
                                "" ,
                                createAccountRequest.getInitialCredit() ,
                    null,
                    LocalDateTime.now(),
                    account1
                        );


                     account1.getTransactions().add(transaction1);
        }




        return accountDtoConvertor.convertToAccountDto(accountRepository.save(account1));
    }






}
