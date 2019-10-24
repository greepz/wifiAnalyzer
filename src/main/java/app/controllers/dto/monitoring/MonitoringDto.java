package app.controllers.dto.monitoring;

import java.util.List;

public class MonitoringDto {
    List<WifiDetailsDto> wiFiDetails;
    WifiConnectionDto wiFiConnection;

    public List<WifiDetailsDto> getWiFiDetails() {
        return wiFiDetails;
    }

    public void setWiFiDetails(List<WifiDetailsDto> wiFiDetails) {
        this.wiFiDetails = wiFiDetails;
    }

    public WifiConnectionDto getWiFiConnection() {
        return wiFiConnection;
    }

    public void setWiFiConnection(WifiConnectionDto wiFiConnection) {
        this.wiFiConnection = wiFiConnection;
    }
}
