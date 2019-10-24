package app.controllers.dto.monitoring;

public class WifiDetailsDto {
    private String ssid;
    private String bssid;
    private String capabilities;
    private WifiSignalDto wifiSignal;
    private WifiAdditionalDto wifiAdditional;
    //TODO в теле запроса не типизированный массив
    private Object[] children;
    private String security;
    private boolean isHidden;

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getBssid() {
        return bssid;
    }

    public void setBsid(String bsid) {
        this.bssid = bssid;
    }

    public String getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
    }

    public WifiSignalDto getWifiSignal() {
        return wifiSignal;
    }

    public void setWifiSignal(WifiSignalDto wifiSignal) {
        this.wifiSignal = wifiSignal;
    }

    public WifiAdditionalDto getWifiAdditional() {
        return wifiAdditional;
    }

    public void setWifiAdditional(WifiAdditionalDto wifiAdditional) {
        this.wifiAdditional = wifiAdditional;
    }

    public Object[] getChildren() {
        return children;
    }

    public void setChildren(Object[] children) {
        this.children = children;
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
}
