package ru.kpfu.itis.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "photo")
public class Photo implements Serializable {

    @Length(max = 200)
    @NotEmpty
    @Basic
    @Column(name = "path", nullable = false)
    private String path;

    @Length(max = 50)
    @NotEmpty
    @Basic
    @Column(nullable = false)
    private String x;

    @Length(max = 50)
    @NotEmpty
    @Basic
    @Column(nullable = false)
    private String y;

/*    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "users")
    private User user;*/

    public Photo(int id, String path, String x, String y) {
        this.id = id;
        this.path = path;
        this.x = x;
        this.y = y;
    }

    public Photo() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.id);
        hash = 19 * hash + Objects.hashCode(this.path);
        hash = 19 * hash + Objects.hashCode(this.x);
        hash = 19 * hash + Objects.hashCode(this.y);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Photo other = (Photo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.path, other.path)) {
            return false;
        }
        if (!Objects.equals(this.x, other.x)) {
            return false;
        }
        if (!Objects.equals(this.y, other.y)) {
            return false;
        }
        return true;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

/*    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/
}
