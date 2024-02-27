package br.com.murillo.marvel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.murillo.marvel.model.OrderItem;
import br.com.murillo.marvel.model.modelPK.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
  
}
