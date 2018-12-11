package Entity;

import javax.persistence.*;

@Entity
@Table(name = "Ticket", schema = "main", catalog = "")
public class TicketEntity {
    private short id;
    private double price;
    private short flightId;

    @Id
    @Column(name = "ID")
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "FlightID")
    public short getFlightId() {
        return flightId;
    }

    public void setFlightId(short flightId) {
        this.flightId = flightId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TicketEntity that = (TicketEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (flightId != that.flightId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) id;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) flightId;
        return result;
    }
}
