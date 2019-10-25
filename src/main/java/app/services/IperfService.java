package app.services;

import app.controllers.dto.iperf.request.IperfDto;
import app.controllers.dto.iperf.request.IperfDtoWithInfo;
import app.controllers.dto.iperf.response.LatencyTestInfo;

public interface IperfService {

    void save(IperfDtoWithInfo iperfDto);

    LatencyTestInfo getLatencyReportById(String id);
}
