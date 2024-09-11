package pe.edu.upc.musictool.dtos;

import jakarta.persistence.Column;
import pe.edu.upc.musictool.entities.Role;

public class UserDTO {
    private int id_user;
    private String nombre_usuario;
    private String correo_usuario;
    private String contraseña_usuario;
    private int telefono_usuario;
    private Role ro;

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
