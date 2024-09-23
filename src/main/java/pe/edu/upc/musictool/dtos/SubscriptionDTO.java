package pe.edu.upc.musictool.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.musictool.entities.Users;

import java.time.LocalDate;

public class SubscriptionDTO {
    private int id;
    private Double type_susciption;
    private LocalDate sub_date;
    private Users user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getType_susciption() {
        return type_susciption;
    }

    public void setType_susciption(Double type_susciption) {
        this.type_susciption = type_susciption;
    }

    public LocalDate getSub_date() {
        return sub_date;
    }

    public void setSub_date(LocalDate sub_date) {
        this.sub_date = sub_date;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
