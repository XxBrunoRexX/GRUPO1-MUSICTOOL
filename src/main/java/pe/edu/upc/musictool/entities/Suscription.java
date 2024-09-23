package pe.edu.upc.musictool.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="suscription")
public class Suscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "type_susciption", nullable = false)
    private String type_susciption;
    @Column(name = "sub_date", nullable = false)
    private LocalDate sub_date;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users user;

    public Suscription() {
    }

    public Suscription(int id, String type_susciption, LocalDate sub_date, Users user) {
        this.id = id;
        this.type_susciption = type_susciption;
        this.sub_date = sub_date;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType_susciption() {
        return type_susciption;
    }

    public void setType_susciption(String type_susciption) {
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
