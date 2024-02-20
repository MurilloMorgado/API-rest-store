package br.com.murillo.marvel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.murillo.marvel.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
  
}
