package app.controllers.dto.iperf.request;

import java.util.List;

public class EndDto {
    private List<SendReceiveDto> streams;
    private StreamDto sum_sent;
    private StreamDto sum_received;
    private CpuUtilizationPercentDto cpu_utilization_percent;

    public List<SendReceiveDto> getStreams() {
        return streams;
    }

    public void setStreams(List<SendReceiveDto> streams) {
        this.streams = streams;
    }

    public StreamDto getSum_sent() {
        return sum_sent;
    }

    public void setSum_sent(StreamDto sum_sent) {
        this.sum_sent = sum_sent;
    }

    public StreamDto getSum_received() {
        return sum_received;
    }

    public void setSum_received(StreamDto sum_received) {
        this.sum_received = sum_received;
    }

    public CpuUtilizationPercentDto getCpu_utilization_percent() {
        return cpu_utilization_percent;
    }

    public void setCpu_utilization_percent(CpuUtilizationPercentDto cpu_utilization_percent) {
        this.cpu_utilization_percent = cpu_utilization_percent;
    }
}
