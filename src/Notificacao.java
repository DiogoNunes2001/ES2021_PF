import java.time.LocalDateTime;

public class Notificacao {

    private int idNotif;
     private LocalDateTime dataHora;
     private Prolongacao idProlong;

    public Notificacao(int idNotif, LocalDateTime dataHora, Prolongacao idProlong) {
        this.idNotif = idNotif;
        this.dataHora = dataHora;
        this.idProlong = idProlong;
    }

    public int getIdNotif() {
        return idNotif;
    }

    public void setIdNotif(int idNotif) {
        this.idNotif = idNotif;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Prolongacao getIdProlong() {
        return idProlong;
    }

    public void setIdProlong(Prolongacao idProlong) {
        this.idProlong = idProlong;
    }

}
