package app.controllers.dto.iperf.request;

import java.util.List;

public class IntervalDto {
    private List<StreamDto> streams;
    private SumDto sum;

    public List<StreamDto> getStreams() {
        return streams;
    }

    public void setStreams(List<StreamDto> streams) {
        this.streams = streams;
    }

    public SumDto getSum() {
        return sum;
    }

    public void setSum(SumDto sum) {
        this.sum = sum;
    }
}
