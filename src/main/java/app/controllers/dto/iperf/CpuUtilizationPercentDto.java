package app.controllers.dto.iperf;

public class CpuUtilizationPercentDto {

     private double host_total;
     private double host_user;
     private double host_system;
     private int remote_total;
     private int remote_user;
     private int remote_system;

    public double getHost_total() {
        return host_total;
    }

    public void setHost_total(double host_total) {
        this.host_total = host_total;
    }

    public double getHost_user() {
        return host_user;
    }

    public void setHost_user(double host_user) {
        this.host_user = host_user;
    }

    public double getHost_system() {
        return host_system;
    }

    public void setHost_system(double host_system) {
        this.host_system = host_system;
    }

    public int getRemote_total() {
        return remote_total;
    }

    public void setRemote_total(int remote_total) {
        this.remote_total = remote_total;
    }

    public int getRemote_user() {
        return remote_user;
    }

    public void setRemote_user(int remote_user) {
        this.remote_user = remote_user;
    }

    public int getRemote_system() {
        return remote_system;
    }

    public void setRemote_system(int remote_system) {
        this.remote_system = remote_system;
    }
}
