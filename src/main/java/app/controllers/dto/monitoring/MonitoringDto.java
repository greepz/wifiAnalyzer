package app.controllers.dto.monitoring;

import app.controllers.dto.common.DeviceDto;

import java.util.List;

public class MonitoringDto {
    List<WifiDetailsDto> wiFiDetails;
    DeviceDto device;

    public DeviceDto getDevice() {
        return device;
    }

    public void setDevice(DeviceDto device) {
        this.device = device;
    }

    public List<WifiDetailsDto> getWiFiDetails() {
        return wiFiDetails;
    }

    public void setWiFiDetails(List<WifiDetailsDto> wiFiDetails) {
        this.wiFiDetails = wiFiDetails;
    }


}
