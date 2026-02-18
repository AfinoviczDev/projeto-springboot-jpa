package dev.afinovicz.vendas.repositories;

import dev.afinovicz.vendas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
