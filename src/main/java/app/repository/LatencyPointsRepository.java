package app.repository;

import app.repository.entity.LatencyPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LatencyPointsRepository extends JpaRepository<LatencyPoint, String> {
}
