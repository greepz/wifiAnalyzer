package app.controllers.dto.iperf.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

public class StartDto {
    private List<ConnectDto> connected;
    private String version;
    private String system_info;
    private int sock_bufsize;
    private int sndbuf_actual;
    private int rcvbuf_actual;
    private TimestampDto timestamp;
    private AcceptConnectionDto accepted_connection;
    private Connecting_toDto connecting_to;
    private String cookie;
    private int tcp_mss_default;
    private TestStartDto test_start;

    public Connecting_toDto getConnecting_to() {
        return connecting_to;
    }

    public void setConnecting_to(Connecting_toDto connecting_to) {
        this.connecting_to = connecting_to;
    }

    public List<ConnectDto> getConnected() {
        return connected;
    }

    public void setConnected(List<ConnectDto> connected) {
        this.connected = connected;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSystem_info() {
        return system_info;
    }

    public void setSystem_info(String system_info) {
        this.system_info = system_info;
    }

    public int getSock_bufsize() {
        return sock_bufsize;
    }

    public void setSock_bufsize(int sock_bufsize) {
        this.sock_bufsize = sock_bufsize;
    }

    public int getSndbuf_actual() {
        return sndbuf_actual;
    }

    public void setSndbuf_actual(int sndbuf_actual) {
        this.sndbuf_actual = sndbuf_actual;
    }

    public int getRcvbuf_actual() {
        return rcvbuf_actual;
    }

    public void setRcvbuf_actual(int rcvbuf_actual) {
        this.rcvbuf_actual = rcvbuf_actual;
    }

    public TimestampDto getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(TimestampDto timestamp) {
        this.timestamp = timestamp;
    }

    public AcceptConnectionDto getAccepted_connection() {
        return accepted_connection;
    }

    public void setAccepted_connection(AcceptConnectionDto accepted_connection) {
        this.accepted_connection = accepted_connection;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public int getTcp_mss_default() {
        return tcp_mss_default;
    }

    public void setTcp_mss_default(int tcp_mss_default) {
        this.tcp_mss_default = tcp_mss_default;
    }

    public TestStartDto getTest_start() {
        return test_start;
    }

    public void setTest_start(TestStartDto test_start) {
        this.test_start = test_start;
    }


}
