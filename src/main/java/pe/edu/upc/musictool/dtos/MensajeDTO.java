package pe.edu.upc.musictool.dtos;

import pe.edu.upc.musictool.entities.Users;

import java.time.LocalDate;

public class MensajeDTO {
    private int id;
    private String content;
    private LocalDate dateSent;
    private Users us;

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

    public Users getUs() {
        return us;
    }

    public void setUs(Users us) {
        this.us = us;
    }
}
