package br.com.wandersontimoteo.hruser.repositories;

import br.com.wandersontimoteo.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
