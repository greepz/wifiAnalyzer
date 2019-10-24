package app.repository;

import app.repository.entity.Analize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalizesRepository extends JpaRepository<Analize, Long> {
}
