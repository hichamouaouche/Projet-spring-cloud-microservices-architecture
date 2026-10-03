package hiou.hicham.customerservice;

import hiou.hicham.customerservice.entities.Customer;
import hiou.hicham.customerservice.repository.CustomerReposiroty;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerReposiroty customerReposiroty) {
        return args -> {
            customerReposiroty.save(Customer.builder()
                    .name("Hicham").email("hicham@gamil.com").build());
            customerReposiroty.save(Customer.builder()
                    .name("aziz").email("aziz@gmail.com").build());
            customerReposiroty.save(Customer.builder()
                    .name("mohamed").email("mohamed@gmail.com").build());
        };
    }

}
