package app.controllers.dto.iperf.response;

import javax.persistence.criteria.CriteriaBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LatencyTestInfo {
    String uuid;
    String bssid;
    String ssid;
    Date date;
    String login;
    Double averageUpload;
    Double averageDownload;
    Integer duration;
    String host;
    Integer port;
    List<LatencyTestPoint> uploadPoints = new ArrayList();
    List<LatencyTestPoint> downloadPoints = new ArrayList<>();

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBssid() {
        return bssid;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Double getAverageUpload() {
        return averageUpload;
    }

    public void setAverageUpload(Double averageUpload) {
        this.averageUpload = averageUpload;
    }

    public Double getAverageDownload() {
        return averageDownload;
    }

    public void setAverageDownload(Double averageDownload) {
        this.averageDownload = averageDownload;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public List<LatencyTestPoint> getUploadPoints() {
        return uploadPoints;
    }

    public void setUploadPoints(List<LatencyTestPoint> uploadPoints) {
        this.uploadPoints = uploadPoints;
    }

    public List<LatencyTestPoint> getDownloadPoints() {
        return downloadPoints;
    }

    public void setDownloadPoints(List<LatencyTestPoint> downloadPoints) {
        this.downloadPoints = downloadPoints;
    }
}
