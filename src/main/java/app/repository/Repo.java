package app.repository;

import app.controllers.dto.iperf.IperfDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<IperfDto, Long> {



}


