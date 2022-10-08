package com.example.service;


public class CustomerServiceTest {

//
//    private CustomerService service;
//    private CustomerRepository repository;
//    private CustomerDtoConvertor customerDtoConvertor;
//
//    @BeforeEach
//    public void setUp() throws Exception {
//        repository = Mockito.mock(CustomerRepository.class);
//        customerDtoConvertor = Mockito.mock(CustomerDtoConvertor.class);
//        service = new CustomerService(repository , customerDtoConvertor , null);
//    }
//
//
//
//    @Test
//    public void testFindCustomerById_whenCustomerIdExists_ShouldReturnCustomer(){
//
//        Customer1 customer1 = new Customer1("id" , "test-name"  ,"test-surname", List.of());
//
//        Mockito.when(repository.findById("id")).thenReturn(Optional.of(customer1));
//
//        Customer1 result = service.findCustomerById("id");
//
//        Assertions.assertEquals(result, customer1);
//
//    }
//
//
//    @Test
//    public void testFindCustomerById_whenCustomerIdDoesNotExists_ShouldThrowCustomerNotFoundException(){
//
//        Mockito.when(repository.findById("id")).thenReturn(Optional.empty());
//
//        Assertions.assertThrows(CustomerNotFoundException.class , ()-> service.findCustomerById("id"));
//
//    }
//
//
//
//
//
//    @Test
//    public void testGetCustomerById_whenCustomerIdExists_ShouldReturnCustomerDto(){
//
//        Customer1 customer1 = new Customer1("id" , "test-name"  ,"test-surname", List.of());
//        CustomerDto customerDto = new CustomerDto("id" , "test-name" , "test-surname" , List.of());
//
//
//        Mockito.when(repository.findById("id")).thenReturn(Optional.of(customer1));
//        Mockito.when(customerDtoConvertor.convertToCustomerDto(customer1)).thenReturn(customerDto);
//
//        CustomerDto result = service.getCustomerById("id");
//
//        Assertions.assertEquals(result, customerDto);
//
//    }
//
//
//    @Test
//    public void testGetCustomerById_whenCustomerIdDoesNotExists_ShouldThrowCustomerNotFoundException(){
//
//        Mockito.when(repository.findById("id")).thenReturn(Optional.empty());
//
//        Assertions.assertThrows(CustomerNotFoundException.class , ()-> service.getCustomerById("id"));
//
//        Mockito.verifyNoInteractions(customerDtoConvertor);
//
//    }
//
//
//
//
//
//
//
//


}