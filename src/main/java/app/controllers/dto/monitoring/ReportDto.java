package app.controllers.dto.monitoring;

import java.time.LocalDateTime;

public class ReportDto {
    private LocalDateTime reportDate;
    private String user;
    private WifiDetailsDto pointDto;

    public LocalDateTime getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDateTime reportDate) {
        this.reportDate = reportDate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public WifiDetailsDto getPointDto() {
        return pointDto;
    }

    public void setPointDto(WifiDetailsDto pointDto) {
        this.pointDto = pointDto;
    }
}
