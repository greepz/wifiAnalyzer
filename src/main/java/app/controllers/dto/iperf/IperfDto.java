package app.controllers.dto.iperf;

import java.util.List;

public class IperfDto {
    private StartDto startDto;
    private List<IntervalDto> intervalDtos;
    private EndDto endDto;

    public StartDto getStartDto() {
        return startDto;
    }

    public void setStartDto(StartDto startDto) {
        this.startDto = startDto;
    }

    public List<IntervalDto> getIntervalDtos() {
        return intervalDtos;
    }

    public void setIntervalDtos(List<IntervalDto> intervalDtos) {
        this.intervalDtos = intervalDtos;
    }

    public EndDto getEndDto() {
        return endDto;
    }

    public void setEndDto(EndDto endDto) {
        this.endDto = endDto;
    }
}
