package pe.edu.upc.musictool.entities;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "PreRelease_Songs")
public class PreRelease_Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Column(name = "genre", nullable = false, length = 100)
    private String genre;
    @Column(name = "duration", nullable = false, length = 10 )
    private Time duration;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public PreRelease_Songs() {}

    public PreRelease_Songs(int id, String name, String genre, Time duration, User user) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.duration = duration;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
