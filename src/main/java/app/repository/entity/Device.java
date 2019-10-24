package app.repository.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name="Devices")
public class Device {
    @Id
    Long deviceId;

    @OneToMany
    List<Analize> analizes = new ArrayList<>();

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }
}
