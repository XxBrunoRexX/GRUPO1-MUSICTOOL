package pe.edu.upc.musictool.dtos;

public class IdRoleDTO {
  private int  id_user;
      private String tipo_role;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getTipo_role() {
        return tipo_role;
    }

    public void setTipo_role(String tipo_role) {
        this.tipo_role = tipo_role;
    }
}
