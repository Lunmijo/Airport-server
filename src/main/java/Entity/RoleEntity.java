package Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Role", schema = "main", catalog = "")
public class RoleEntity {
    private Short admin;
    private Short user;

    @Basic
    @Column(name = "Admin")
    public Short getAdmin() {
        return admin;
    }

    public void setAdmin(Short admin) {
        this.admin = admin;
    }

    @Basic
    @Column(name = "User")
    public Short getUser() {
        return user;
    }

    public void setUser(Short user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity that = (RoleEntity) o;

        if (admin != null ? !admin.equals(that.admin) : that.admin != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = admin != null ? admin.hashCode() : 0;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }
}
