package hiou.hicham.inventorysrvice;

import hiou.hicham.inventorysrvice.entities.Product;
import hiou.hicham.inventorysrvice.repository.ProdutRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventorySrviceApplication {

    public static void main(String[] args) {

        SpringApplication.run(InventorySrviceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProdutRepository produtRepository){
        return args -> {
            produtRepository.save(Product.builder()
                    .name("computer").price(100).quantity(10).build());
            produtRepository.save(Product.builder()
                    .name("phone").price(200).quantity(20).build());
            produtRepository.save(Product.builder()
                    .name("laptop").price(300).quantity(30).build());
        };
    }

}
