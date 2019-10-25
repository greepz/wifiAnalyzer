package app.repository.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Entity
public class LatencyTest {
    @Id
    String id;
    @OneToMany(cascade = CascadeType.ALL)
    List<LatencyPoint> points = new ArrayList<>();
    Long created;
    String version;
    String systemInfo;
    String acceptedConnectionHost;
    Integer acceptedConnectionPort;
    String protocol;
    Integer duration;
    Long summarySendBytes;
    Long summaryReceiveBytes;
    Double summaryReceiveBps;
    Double summarySendBps;
    @ManyToOne
    Point point;
    @ManyToOne
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getSummaryReceiveBps() {
        return summaryReceiveBps;
    }

    public void setSummaryReceiveBps(Double summaryReceiveBps) {
        this.summaryReceiveBps = summaryReceiveBps;
    }

    public Double getSummarySendBps() {
        return summarySendBps;
    }

    public void setSummarySendBps(Double summarySendBps) {
        this.summarySendBps = summarySendBps;
    }

    public Long getSummarySendBytes() {
        return summarySendBytes;
    }

    public void setSummarySendBytes(Long summarySendBytes) {
        this.summarySendBytes = summarySendBytes;
    }

    public Long getSummaryReceiveBytes() {
        return summaryReceiveBytes;
    }

    public void setSummaryReceiveBytes(Long summaryReceiveBytes) {
        this.summaryReceiveBytes = summaryReceiveBytes;
    }

    public List<LatencyPoint> getPoints() {
        return points;
    }

    public void setPoints(List<LatencyPoint> points) {
        this.points = points;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
    }

    public String getAcceptedConnectionHost() {
        return acceptedConnectionHost;
    }

    public void setAcceptedConnectionHost(String acceptedConnectionHost) {
        this.acceptedConnectionHost = acceptedConnectionHost;
    }

    public Integer getAcceptedConnectionPort() {
        return acceptedConnectionPort;
    }

    public void setAcceptedConnectionPort(Integer acceptedConnectionPort) {
        this.acceptedConnectionPort = acceptedConnectionPort;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getId() {
        return id;
    }
}
