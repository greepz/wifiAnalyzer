package app.repository.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Devices")
public class Device {
    @Id
    Long deviceId;
}
