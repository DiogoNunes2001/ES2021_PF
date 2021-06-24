import java.time.LocalDateTime;

public class Emprestimo {

    private int idEmp;
    private LocalDateTime dataHoraEmp;
    private LocalDateTime duracaoEmp;
    private String termoResponsabilidade;
    private Copia copia;
    private Utilizador utilizador;

    public Emprestimo(int idEmp, LocalDateTime dataHoraEmp, LocalDateTime duracaoEmp, String termoResponsabilidade, Copia copia, Utilizador utilizador) {
        this.idEmp = idEmp;
        this.dataHoraEmp = dataHoraEmp;
        this.duracaoEmp = duracaoEmp;
        this.termoResponsabilidade = termoResponsabilidade;
        this.copia = copia;
        this.utilizador = utilizador;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public void setDataHoraEmp(LocalDateTime dataHoraEmp) {
        this.dataHoraEmp = dataHoraEmp;
    }

    public void setDuracaoEmp(LocalDateTime duracaoEmp) {
        this.duracaoEmp = duracaoEmp;
    }

    public void setTermoResponsabilidade(String termoResponsabilidade) {
        this.termoResponsabilidade = termoResponsabilidade;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public LocalDateTime getDataHoraEmp() {
        return dataHoraEmp;
    }

    public LocalDateTime getDuracaoEmp() {
        return duracaoEmp;
    }

    public String getTermoResponsabilidade() {
        return termoResponsabilidade;
    }

    public Copia getCopia() {
        return copia;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

}
