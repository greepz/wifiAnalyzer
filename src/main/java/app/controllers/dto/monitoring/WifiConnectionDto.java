package app.controllers.dto.monitoring;


public class WifiConnectionDto {

    private String ssid;
    private String bssid;
    private String ipAddress;
    private String linkSpeed;
    private String macAddressDevice;

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getBssid() {
        return bssid;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLinkSpeed() {
        return linkSpeed;
    }

    public void setLinkSpeed(String linkSpeed) {
        this.linkSpeed = linkSpeed;
    }

    public String getMacAddressDevice() {
        return macAddressDevice;
    }

    public void setMacAddressDevice(String macAddressDevice) {
        this.macAddressDevice = macAddressDevice;
    }
}
