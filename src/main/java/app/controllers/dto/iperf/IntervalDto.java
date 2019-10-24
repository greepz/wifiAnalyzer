package app.controllers.dto.iperf;

import java.util.List;

public class IntervalDto {
    private List<StreamDto> streamDtos;
    private SumDto sumDto;

    public List<StreamDto> getStreamDtos() {
        return streamDtos;
    }

    public void setStreamDtos(List<StreamDto> streamDtos) {
        this.streamDtos = streamDtos;
    }

    public SumDto getSumDto() {
        return sumDto;
    }

    public void setSumDto(SumDto sumDto) {
        this.sumDto = sumDto;
    }
}
