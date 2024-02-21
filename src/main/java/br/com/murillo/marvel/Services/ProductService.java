package br.com.murillo.marvel.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.murillo.marvel.Repository.ProductRepository;
import br.com.murillo.marvel.model.Product;

@Service
public class ProductService {

  @Autowired
  private ProductRepository repository;

  public List<Product> findAll() {
    return repository.findAll();
  }

  public Product findById(Long id) {
    Optional<Product> obj = repository.findById(id);
    return obj.get();
  }

}
