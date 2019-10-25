package app.controllers.dto.iperf.request;

import java.util.List;

public class IperfDto {
    private StartDto start;
    private List<IntervalDto> intervals;
    private EndDto end;

    public StartDto getStart() {
        return start;
    }

    public void setStart(StartDto start) {
        this.start = start;
    }

    public List<IntervalDto> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<IntervalDto> intervals) {
        this.intervals = intervals;
    }

    public EndDto getEnd() {
        return end;
    }

    public void setEnd(EndDto end) {
        this.end = end;
    }
}
