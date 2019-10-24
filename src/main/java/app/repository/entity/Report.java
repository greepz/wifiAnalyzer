package app.repository.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name="Reports")
public class Report {
    @Id
    Long reportId;

    @OneToOne
    Point point;

    @ManyToOne
    Analize analize;

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Analize getAnalize() {
        return analize;
    }

    public void setAnalize(Analize analize) {
        this.analize = analize;
    }
}
