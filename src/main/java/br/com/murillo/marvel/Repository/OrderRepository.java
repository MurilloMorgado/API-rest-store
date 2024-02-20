package br.com.murillo.marvel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.murillo.marvel.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
  
}
