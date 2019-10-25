package app.repository;

import app.repository.entity.LatencyPoint;
import app.repository.entity.LatencyTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LatencyTestRepository extends JpaRepository<LatencyTest, String> {
}
