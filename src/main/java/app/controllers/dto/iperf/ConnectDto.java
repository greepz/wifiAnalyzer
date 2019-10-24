package app.controllers.dto.iperf;

public class ConnectDto {
   private int socket;
   private String local_host;
   private int local_port;
   private String remote_host;
   private int remote_port;

    public int getSocket() {
        return socket;
    }

    public void setSocket(int socket) {
        this.socket = socket;
    }

    public String getLocal_host() {
        return local_host;
    }

    public void setLocal_host(String local_host) {
        this.local_host = local_host;
    }

    public int getLocal_port() {
        return local_port;
    }

    public void setLocal_port(int local_port) {
        this.local_port = local_port;
    }

    public String getRemote_host() {
        return remote_host;
    }

    public void setRemote_host(String remote_host) {
        this.remote_host = remote_host;
    }

    public int getRemote_port() {
        return remote_port;
    }

    public void setRemote_port(int remote_port) {
        this.remote_port = remote_port;
    }
}
