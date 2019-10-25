package app.repository.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name="Users")
public class User {
    @Id
    @GeneratedValue
    Long userId;
    String login;
    String password;

    @OneToMany(cascade = CascadeType.ALL)
    List<Analize> analizes = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    List<LatencyTest> latencyTests = new ArrayList<>();

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Analize> getAnalizes() {
        return analizes;
    }

    public void setAnalizes(List<Analize> analizes) {
        this.analizes = analizes;
    }
}
