package app.controllers.dto.iperf.request;

public class TimestampDto {

      private String time;
      private long timesecs;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getTimesecs() {
        return timesecs;
    }

    public void setTimesecs(long timesecs) {
        this.timesecs = timesecs;
    }
}
