package Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Plane", schema = "main", catalog = "")
public class PlaneEntity {
    private Short id;
    private Short name;
    private Short seats;
    private Short avaliable;

    @Basic
    @Column(name = "ID")
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name")
    public Short getName() {
        return name;
    }

    public void setName(Short name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Seats")
    public Short getSeats() {
        return seats;
    }

    public void setSeats(Short seats) {
        this.seats = seats;
    }

    @Basic
    @Column(name = "Avaliable")
    public Short getAvaliable() {
        return avaliable;
    }

    public void setAvaliable(Short avaliable) {
        this.avaliable = avaliable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaneEntity that = (PlaneEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (seats != null ? !seats.equals(that.seats) : that.seats != null) return false;
        if (avaliable != null ? !avaliable.equals(that.avaliable) : that.avaliable != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (seats != null ? seats.hashCode() : 0);
        result = 31 * result + (avaliable != null ? avaliable.hashCode() : 0);
        return result;
    }
}
