package Entity;

import javax.persistence.*;

@Entity
@Table(name = "User", schema = "main", catalog = "")
public class UserEntity {
    private short id;
    private String login;
    private String email;
    private String password;
    private Short tiketsId;
    private short role;

    @Id
    @Column(name = "ID")
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Tikets ID")
    public Short getTiketsId() {
        return tiketsId;
    }

    public void setTiketsId(Short tiketsId) {
        this.tiketsId = tiketsId;
    }

    @Basic
    @Column(name = "Role")
    public short getRole() {
        return role;
    }

    public void setRole(short role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (role != that.role) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (tiketsId != null ? !tiketsId.equals(that.tiketsId) : that.tiketsId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (tiketsId != null ? tiketsId.hashCode() : 0);
        result = 31 * result + (int) role;
        return result;
    }
}
