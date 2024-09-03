package pe.edu.upc.musictool.dtos;

import jakarta.persistence.Column;

import java.sql.Time;

public class PreRelease_SongsDTO {
    private int id;
    private String name;
    private String genre;
    private Time duration;

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
}
