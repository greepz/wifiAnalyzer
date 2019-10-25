package app.controllers.dto.iperf.request;

public class StreamDto {
    private int socket;
    private double start;
    private double end;
    private double seconds;
    private long bytes;
    private double bits_per_second;
    private int retransmits;
    private int max_snd_cwnd;
    private int max_rtt;
    private int min_rtt;
    private int mean_rtt;
    private int snd_cwnd;
    private int rtt;
    private int rttvar;
    private int pmtu;

    private boolean omitted;
    private boolean sender;

    public int getMax_snd_cwnd() {
        return max_snd_cwnd;
    }

    public void setMax_snd_cwnd(int max_snd_cwnd) {
        this.max_snd_cwnd = max_snd_cwnd;
    }

    public int getMax_rtt() {
        return max_rtt;
    }

    public void setMax_rtt(int max_rtt) {
        this.max_rtt = max_rtt;
    }

    public int getMin_rtt() {
        return min_rtt;
    }

    public void setMin_rtt(int min_rtt) {
        this.min_rtt = min_rtt;
    }

    public int getMean_rtt() {
        return mean_rtt;
    }

    public void setMean_rtt(int mean_rtt) {
        this.mean_rtt = mean_rtt;
    }

    public int getRtt() {
        return rtt;
    }

    public void setRtt(int rtt) {
        this.rtt = rtt;
    }

    public int getRttvar() {
        return rttvar;
    }

    public void setRttvar(int rttvar) {
        this.rttvar = rttvar;
    }

    public int getPmtu() {
        return pmtu;
    }

    public void setPmtu(int pmtu) {
        this.pmtu = pmtu;
    }

    public int getSnd_cwnd() {
        return snd_cwnd;
    }

    public void setSnd_cwnd(int snd_cwnd) {
        this.snd_cwnd = snd_cwnd;
    }

    public int getRetransmits() {
        return retransmits;
    }

    public void setRetransmits(int retransmits) {
        this.retransmits = retransmits;
    }

    public int getSocket() {
        return socket;
    }

    public void setSocket(int socket) {
        this.socket = socket;
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
