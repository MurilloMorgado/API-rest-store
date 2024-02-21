package br.com.murillo.marvel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.murillo.marvel.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
  
}
