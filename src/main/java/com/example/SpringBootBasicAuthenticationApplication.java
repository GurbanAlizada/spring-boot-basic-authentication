
package com.example;

        import com.example.model.Customer;
        import com.example.repository.AccountRepository;
        import com.example.repository.CustomerRepository;
        import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.annotation.Bean;
        import springfox.documentation.builders.RequestHandlerSelectors;
        import springfox.documentation.spi.DocumentationType;
        import springfox.documentation.spring.web.plugins.Docket;
        import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootBasicAuthenticationApplication  implements CommandLineRunner {


    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;

    public SpringBootBasicAuthenticationApplication(AccountRepository accountRepository,
                              CustomerRepository customerRepository) {
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicAuthenticationApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Customer customer1 = customerRepository.save(new Customer(null , "Messi" ,"Leo" , null));
        Customer customer12 = customerRepository.save(new Customer(null , "Ronaldo" ,"Cr" , null));
        Customer customer13 = customerRepository.save(new Customer(null , "Neymar" ,"Jr" , null));

        System.out.println(customer1);
        System.out.println(customer12);
        System.out.println(customer13);
    }




    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                .build();
    }


}
