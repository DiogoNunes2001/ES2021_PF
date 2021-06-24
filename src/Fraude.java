import java.time.LocalDateTime;

public class Fraude {

    private int idFraude;
    private LocalDateTime dataHora;
    private TipoFraude tipo;
    private Utilizador utilizador_fraude;
    private Administrador admin_resp;

    public Fraude(int idFraude, LocalDateTime dataHora, TipoFraude tipo, Utilizador utilizador_fraude, Administrador admin_resp) {
        this.idFraude = idFraude;
        this.dataHora = dataHora;
        this.tipo = tipo;
        this.utilizador_fraude = utilizador_fraude;
        this.admin_resp = admin_resp;
    }

    public int getIdFraude() {
        return idFraude;
    }

    public void setIdFraude(int idFraude) {
        this.idFraude = idFraude;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public TipoFraude getTipo() {
        return tipo;
    }

    public void setTipo(TipoFraude tipo) {
        this.tipo = tipo;
    }

    public Utilizador getUtilizador_fraude() {
        return utilizador_fraude;
    }

    public void setUtilizador_fraude(Utilizador utilizador_fraude) {
        this.utilizador_fraude = utilizador_fraude;
    }

    public Administrador getAdmin_resp() {
        return admin_resp;
    }

    public void setAdmin_resp(Administrador admin_resp) {
        this.admin_resp = admin_resp;
    }

}
