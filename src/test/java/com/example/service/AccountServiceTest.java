package com.example.service;


public class AccountServiceTest {

//    private  AccountService accountService;
//
//    private  AccountRepository accountRepository;
//    private  CustomerService customerService;
//    private  AccountDtoConvertor accountDtoConvertor;
//
//    @BeforeEach
//    public void setUp(){
//        accountRepository = Mockito.mock(AccountRepository.class);
//        customerService = Mockito.mock(CustomerService.class);
//        accountDtoConvertor = Mockito.mock(AccountDtoConvertor.class);
//        accountService = new AccountService(accountRepository , customerService  , accountDtoConvertor);
//
//    }
//
//
//
//    @Test
//    public void testCreateAccount_whenCustomerIdExistsAndIntialCreaditMoreThanZero_itShouldCreateAccountWithTransaction(){
//
//        CreateAccountRequest createAccountRequest = new CreateAccountRequest(
//                "customer1-id" ,
//                new BigDecimal(200)
//        );
//
//
//        Customer1 customer1 = new Customer1("customer1-id" , "customer1-name" , "customer1-surname", null );
//
//
//        Account1 account1 = new Account1(null, new BigDecimal(200), LocalDateTime.of(2022,11,11,22,22), customer1, new ArrayList<>());
//
//
//        Transaction1 transaction = new Transaction1(null, createAccountRequest.getInitialCredit(), TransactionType.INITIAL, LocalDateTime.of(2022,11,11,22,22), account1);
//        account1.getTransactions().add(transaction);
//
//
//
//        TransactionDto transactionDto = new TransactionDto("", new BigDecimal(200), TransactionType.INITIAL,  LocalDateTime.of(2022,11,11,22,22));
//
//        AccountCustomerDto customerDto = new AccountCustomerDto("customer1-id",
//                "customer1-name",
//                "customer1-surname");
//
//
//        AccountDto expected = new AccountDto(null, new BigDecimal(200),  LocalDateTime.of(2022,11,11,22,22), customerDto, new ArrayList<>());
//
//
//
//
//        Mockito.when(customerService.findCustomerById("customer1-id")).thenReturn(customer1);
//        Mockito.when(accountRepository.save(account1)).thenReturn(account1);
//        Mockito.when(accountDtoConvertor.convertToAccountDto(account1)).thenReturn(expected);
//
//        AccountDto result = accountService.createAccount(createAccountRequest);
//
//
//        Mockito.verify(customerService).findCustomerById(createAccountRequest.getCustomerId());
//        Mockito.verify(accountDtoConvertor).convertToAccountDto(account1);
//     //   Mockito.verify(accountRepository).save(account1);
//
//
//       // Assertions.assertEquals(result , expected);
//
//    }
//
//
//
//
//



}