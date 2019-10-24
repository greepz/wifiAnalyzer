package app.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name="Reports")
public class Report {
    @Id
    @GeneratedValue
    Long reportId;
    private int primaryFrequency;
    private int centerFrequency;
    private String wiFiWidth;
    private int  level;
    private boolean is80211mc;
    private String wiFiBand;
    private int frequencyStart;
    private int frequencyEnd;
    private String strength;
    private String distance;
    private String channelDisplay;
    private int primaryWiFiChannel;
    private int primaryWiFiFrequency;
    private int centerWiFiFrequency;
    private int centerWiFiChannel;
    private String security;
    private boolean isHidden;

    public int getCenterWiFiFrequency() {
        return centerWiFiFrequency;
    }

    public void setCenterWiFiFrequency(int centerWiFiFrequency) {
        this.centerWiFiFrequency = centerWiFiFrequency;
    }

    public int getCenterWiFiChannel() {
        return centerWiFiChannel;
    }

    public void setCenterWiFiChannel(int centerWiFiChannel) {
        this.centerWiFiChannel = centerWiFiChannel;
    }

    public int getPrimaryWiFiFrequency() {
        return primaryWiFiFrequency;
    }

    public void setPrimaryWiFiFrequency(int primaryWiFiFrequency) {
        this.primaryWiFiFrequency = primaryWiFiFrequency;
    }

    public int getPrimaryWiFiChannel() {
        return primaryWiFiChannel;
    }

    public void setPrimaryWiFiChannel(int primaryWiFiChannel) {
        this.primaryWiFiChannel = primaryWiFiChannel;
    }

    public int getPrimaryFrequency() {
        return primaryFrequency;
    }

    public void setPrimaryFrequency(int primaryFrequency) {
        this.primaryFrequency = primaryFrequency;
    }

    public int getCenterFrequency() {
        return centerFrequency;
    }

    public void setCenterFrequency(int centerFrequency) {
        this.centerFrequency = centerFrequency;
    }

    public String getWiFiWidth() {
        return wiFiWidth;
    }

    public void setWiFiWidth(String wiFiWidth) {
        this.wiFiWidth = wiFiWidth;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isIs80211mc() {
        return is80211mc;
    }

    public void setIs80211mc(boolean is80211mc) {
        this.is80211mc = is80211mc;
    }

    public String getWiFiBand() {
        return wiFiBand;
    }

    public void setWiFiBand(String wiFiBand) {
        this.wiFiBand = wiFiBand;
    }

    public int getFrequencyStart() {
        return frequencyStart;
    }

    public void setFrequencyStart(int frequencyStart) {
        this.frequencyStart = frequencyStart;
    }

    public int getFrequencyEnd() {
        return frequencyEnd;
    }

    public void setFrequencyEnd(int frequencyEnd) {
        this.frequencyEnd = frequencyEnd;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getChannelDisplay() {
        return channelDisplay;
    }

    public void setChannelDisplay(String channelDisplay) {
        this.channelDisplay = channelDisplay;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    @ManyToOne
    Point point;

    @ManyToOne
    Analize analize;

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Analize getAnalize() {
        return analize;
    }

    public void setAnalize(Analize analize) {
        this.analize = analize;
    }
}
