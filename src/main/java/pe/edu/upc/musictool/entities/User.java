package pe.edu.upc.musictool.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;
    @Column(name = "nombre_usuario",nullable = false, length = 15)
    private String nombre_usuario;
    @Column(name = "correo_usuario",nullable = false, length = 25)
    private String correo_usuario;
    @Column(name = "contraseña_usuario",nullable = false, length = 15)
    private String contraseña_usuario;
    @Column(name = "telefono_usuario", length = 9)
    private int telefono_usuario;
    @ManyToOne
    @JoinColumn(name = "idRole")
    private Role ro;
    public User() {
    }
    public User(int id_user, String nombre_usuario, String correo_usuario, String contraseña_usuario, int telefono_usuario, Role ro) {
        this.id_user = id_user;
        this.nombre_usuario = nombre_usuario;
        this.correo_usuario = correo_usuario;
        this.contraseña_usuario = contraseña_usuario;
        this.telefono_usuario = telefono_usuario;
        this.ro = ro;
    }


    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getContraseña_usuario() {
        return contraseña_usuario;
    }

    public void setContraseña_usuario(String contraseña_usuario) {
        this.contraseña_usuario = contraseña_usuario;
    }

    public int getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(int telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public Role getRo() {
        return ro;
    }

    public void setRo(Role ro) {
        this.ro = ro;
    }


}



