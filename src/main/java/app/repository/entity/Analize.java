package app.repository.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name="Analizes")
public class Analize {
    @Id
    @GeneratedValue
    Long analizeId;

    @OneToMany(cascade = CascadeType.ALL)
    List<Report> reports = new ArrayList<>();

    @OneToOne
    User user;

    @ManyToOne
    Device device;

    Long created;

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getAnalizeId() {
        return analizeId;
    }

    public void setAnalizeId(Long analizeId) {
        this.analizeId = analizeId;
    }

    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
