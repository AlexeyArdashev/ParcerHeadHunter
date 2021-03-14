package parcer.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import parcer.app.vo.AreaVO;


public interface AreaRepository extends JpaRepository<AreaVO, String> {

}
