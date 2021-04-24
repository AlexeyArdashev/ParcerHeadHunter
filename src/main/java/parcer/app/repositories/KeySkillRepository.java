package parcer.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import parcer.app.vo.KeySkillVO;

import java.util.Optional;
import java.util.UUID;

public interface KeySkillRepository extends JpaRepository<KeySkillVO, UUID> {

    @Query("select c from KeySkillVO c where lower(c.name) = lower(:name)")
    Optional<KeySkillVO> findByName(String name);
}
