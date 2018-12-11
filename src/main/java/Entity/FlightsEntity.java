package Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Flights", schema = "main", catalog = "")
public class FlightsEntity {
    private Short id;
    private String destination;
    private Short dateTimeFrom;
    private Short dateTimeArrive;
    private Short planeId;

    @Basic
    @Column(name = "ID")
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Destination")
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Basic
    @Column(name = "DateTimeFrom")
    public Short getDateTimeFrom() {
        return dateTimeFrom;
    }

    public void setDateTimeFrom(Short dateTimeFrom) {
        this.dateTimeFrom = dateTimeFrom;
    }

    @Basic
    @Column(name = "DateTimeArrive")
    public Short getDateTimeArrive() {
        return dateTimeArrive;
    }

    public void setDateTimeArrive(Short dateTimeArrive) {
        this.dateTimeArrive = dateTimeArrive;
    }

    @Basic
    @Column(name = "PlaneID")
    public Short getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Short planeId) {
        this.planeId = planeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightsEntity that = (FlightsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;
        if (dateTimeFrom != null ? !dateTimeFrom.equals(that.dateTimeFrom) : that.dateTimeFrom != null) return false;
        if (dateTimeArrive != null ? !dateTimeArrive.equals(that.dateTimeArrive) : that.dateTimeArrive != null)
            return false;
        if (planeId != null ? !planeId.equals(that.planeId) : that.planeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (dateTimeFrom != null ? dateTimeFrom.hashCode() : 0);
        result = 31 * result + (dateTimeArrive != null ? dateTimeArrive.hashCode() : 0);
        result = 31 * result + (planeId != null ? planeId.hashCode() : 0);
        return result;
    }
}
