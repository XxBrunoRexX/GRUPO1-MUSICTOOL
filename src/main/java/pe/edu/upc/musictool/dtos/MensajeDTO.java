package pe.edu.upc.musictool.dtos;

import pe.edu.upc.musictool.entities.User;

import java.time.LocalDate;

public class MensajeDTO {
    private int id;
    private String content;
    private LocalDate dateSent;
    private User us;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDateSent() {
        return dateSent;
    }

    public void setDateSent(LocalDate dateSent) {
        this.dateSent = dateSent;
    }

    public User getUs() {
        return us;
    }

    public void setUs(User us) {
        this.us = us;
    }
}
