package app.repository.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LatencyPoint {
    @Id
    @GeneratedValue
    Long id;
    @ManyToOne
    LatencyTest test;

    Double start;
    Double end;
    Long bytes;
    Double bps;
    Boolean sender;

    public Boolean getSender() {
        return sender;
    }

    public void setSender(Boolean sender) {
        this.sender = sender;
    }

    public LatencyTest getTest() {
        return test;
    }

    public void setTest(LatencyTest test) {
        this.test = test;
    }

    public Double getStart() {
        return start;
    }

    public void setStart(Double start) {
        this.start = start;
    }

    public Double getEnd() {
        return end;
    }

    public void setEnd(Double end) {
        this.end = end;
    }

    public Long getBytes() {
        return bytes;
    }

    public void setBytes(Long bytes) {
        this.bytes = bytes;
    }

    public Double getBps() {
        return bps;
    }

    public void setBps(Double bps) {
        this.bps = bps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
