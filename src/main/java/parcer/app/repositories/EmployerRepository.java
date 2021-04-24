package parcer.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import parcer.app.vo.EmployerVO;


public interface EmployerRepository extends JpaRepository<EmployerVO, String> {
}
