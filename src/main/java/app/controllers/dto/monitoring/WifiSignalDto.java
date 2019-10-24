package app.controllers.dto.monitoring;

public class WifiSignalDto {
    private int primaryFrequency;
    private int centerFrequency;
    private String wiFiWidth;
    private int  level;
    private boolean is80211mc;
    private String wiFiBand;
    private int frequencyStart;
    private int frequencyEnd;
    private WifiChannelDto primaryWiFiChannel;
    private WifiChannelDto centerWiFiChannel;
    private String strength;
    private String distance;
    private String channelDisplay;

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

    public WifiChannelDto getPrimaryWiFiChannel() {
        return primaryWiFiChannel;
    }

    public void setPrimaryWiFiChannel(WifiChannelDto primaryWiFiChannel) {
        this.primaryWiFiChannel = primaryWiFiChannel;
    }

    public WifiChannelDto getCenterWiFiChannel() {
        return centerWiFiChannel;
    }

    public void setCenterWiFiChannel(WifiChannelDto centerWiFiChannel) {
        this.centerWiFiChannel = centerWiFiChannel;
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
}
