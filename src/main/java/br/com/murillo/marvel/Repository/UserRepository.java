package br.com.murillo.marvel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.murillo.marvel.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
}
