package parcer.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import parcer.app.vo.VacancyVO;

import java.util.UUID;

public interface VacancyRepository extends JpaRepository<VacancyVO, UUID> {
}
