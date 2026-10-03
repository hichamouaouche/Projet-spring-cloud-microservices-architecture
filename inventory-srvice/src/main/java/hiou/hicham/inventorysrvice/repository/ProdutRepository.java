package hiou.hicham.inventorysrvice.repository;

import hiou.hicham.inventorysrvice.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProdutRepository extends JpaRepository<Product, Long> {
}
