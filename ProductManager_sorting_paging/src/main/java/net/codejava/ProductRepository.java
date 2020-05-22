package net.codejava;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

// public interface ProductRepository extends JpaRepository<Product, Long> {

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

}
