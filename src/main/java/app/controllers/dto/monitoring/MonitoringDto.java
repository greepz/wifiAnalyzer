package app.controllers.dto.monitoring;

import app.controllers.dto.common.DeviceDto;

import java.util.List;

public class MonitoringDto {
    List<WifiDetailsDto> wiFiDetails;
    DeviceDto deviceDto;

    public DeviceDto getDeviceDto() {
        return deviceDto;
    }

    public void setDeviceDto(DeviceDto deviceDto) {
        this.deviceDto = deviceDto;
    }

    public List<WifiDetailsDto> getWiFiDetails() {
        return wiFiDetails;
    }

    public void setWiFiDetails(List<WifiDetailsDto> wiFiDetails) {
        this.wiFiDetails = wiFiDetails;
    }
}
