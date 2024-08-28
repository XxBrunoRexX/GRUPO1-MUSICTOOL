package pe.edu.upc.musictool.dtos;

public class MensajeDTO {
    private int id;
    private String content;
    private String dataSent;

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

    public String getDataSent() {
        return dataSent;
    }

    public void setDataSent(String dataSent) {
        this.dataSent = dataSent;
    }
}
