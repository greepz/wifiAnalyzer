package app.controllers.dto.monitoring;

import java.util.Date;
import java.time.LocalDateTime;

public class ReportDto {
    private Long id;
    private Date reportDate;
    private String user;
    private WifiDetailsDto pointDto;

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
