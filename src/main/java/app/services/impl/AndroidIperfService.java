package app.services.impl;

import app.controllers.dto.iperf.IperfDto;
import app.repository.Repo;
import app.services.IperfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;



@Component
public class AndroidIperfService implements IperfService {



    @Override
    public void save(IperfDto iperfDto) {

    }
}
