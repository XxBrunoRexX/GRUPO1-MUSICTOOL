package pe.edu.upc.musictool.dtos;

public class UserDTO {
    private Long id;
    private String username;
    private String correo_usuario;
    private String password;
    private int telefono_usuario;
    private Boolean enabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(int telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
