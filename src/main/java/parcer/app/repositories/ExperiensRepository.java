package parcer.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import parcer.app.vo.ExperiensVO;

public interface ExperiensRepository extends JpaRepository<ExperiensVO, String> {
}
