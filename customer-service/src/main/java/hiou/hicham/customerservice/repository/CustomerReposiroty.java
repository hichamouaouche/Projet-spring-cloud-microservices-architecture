package hiou.hicham.customerservice.repository;

import hiou.hicham.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// all his fo connect a data base

@RepositoryRestResource
public interface CustomerReposiroty extends JpaRepository<Customer, Long> {
}
