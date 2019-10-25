package app.controllers.dto.iperf.request;

public class SumDto {
    private double start;
    private double end;
    private double seconds;
    private long bytes;
    private double bits_per_second;
    private int retransmits;
    private boolean omitted;
    private boolean sender;

    public int getRetransmits() {
        return retransmits;
    }

    public void setRetransmits(int retransmits) {
        this.retransmits = retransmits;
    }

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public double getSeconds() {
        return seconds;
    }

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    public long getBytes() {
        return bytes;
    }

    public void setBytes(long bytes) {
        this.bytes = bytes;
    }

    public double getBits_per_second() {
        return bits_per_second;
    }

    public void setBits_per_second(double bits_per_second) {
        this.bits_per_second = bits_per_second;
    }

    public boolean isOmitted() {
        return omitted;
    }

    public void setOmitted(boolean omitted) {
        this.omitted = omitted;
    }

    public boolean isSender() {
        return sender;
    }

    public void setSender(boolean sender) {
        this.sender = sender;
    }
}
