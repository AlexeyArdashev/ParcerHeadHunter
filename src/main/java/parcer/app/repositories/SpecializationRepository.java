package parcer.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import parcer.app.vo.SpecializationVO;

public interface SpecializationRepository extends JpaRepository<SpecializationVO, String> {
}

