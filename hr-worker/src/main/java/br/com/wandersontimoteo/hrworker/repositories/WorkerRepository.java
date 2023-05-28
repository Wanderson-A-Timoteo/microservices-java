package br.com.wandersontimoteo.hrworker.repositories;

import br.com.wandersontimoteo.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
