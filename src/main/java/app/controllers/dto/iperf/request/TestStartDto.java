package app.controllers.dto.iperf.request;

public class TestStartDto {
    private String protocol;
    private int num_streams;
    private int blksize;
    private int omit;
    private int duration;
    private int bytes;
    private int blocks;
    private int reverse;
    private int tos;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public int getNum_streams() {
        return num_streams;
    }

    public void setNum_streams(int num_streams) {
        this.num_streams = num_streams;
    }

    public int getBlksize() {
        return blksize;
    }

    public void setBlksize(int blksize) {
        this.blksize = blksize;
    }

    public int getOmit() {
        return omit;
    }

    public void setOmit(int omit) {
        this.omit = omit;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getReverse() {
        return reverse;
    }

    public void setReverse(int reverse) {
        this.reverse = reverse;
    }

    public int getTos() {
        return tos;
    }

    public void setTos(int tos) {
        this.tos = tos;
    }
}
