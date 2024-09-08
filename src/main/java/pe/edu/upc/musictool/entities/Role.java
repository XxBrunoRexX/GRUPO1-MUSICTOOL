package pe.edu.upc.musictool.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    @Column(name = "TipoRole",nullable = false, length = 15)
    private String TipoRole;

    public Role() {
    }

    public Role(int idRole, String tipoRole) {
        this.idRole = idRole;
        TipoRole = tipoRole;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getTipoRole() {
        return TipoRole;
    }

    public void setTipoRole(String tipoRole) {
        TipoRole = tipoRole;
    }
}
