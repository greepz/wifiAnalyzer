package app.controllers.dto.iperf.request;

public class IperfDtoWithInfo {
    IperfInfoDto info;
    IperfDto iperf;

    public IperfDtoWithInfo(IperfInfoDto info, IperfDto iperf) {
        this.info = info;
        this.iperf = iperf;
    }

    public IperfDtoWithInfo(){

    }

    public IperfInfoDto getInfo() {
        return info;
    }

    public void setInfo(IperfInfoDto info) {
        this.info = info;
    }

    public IperfDto getIperf() {
        return iperf;
    }

    public void setIperf(IperfDto iperf) {
        this.iperf = iperf;
    }


}
