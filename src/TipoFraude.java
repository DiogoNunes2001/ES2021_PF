public class TipoFraude {

    private int idTipoFraude;
    private String descricao;

    public TipoFraude(int idTipoFraude, String descricao) {
        this.idTipoFraude = idTipoFraude;
        this.descricao = descricao;
    }

    public void setIdTipoFraude(int idTipoFraude) {
        this.idTipoFraude = idTipoFraude;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdTipoFraude() {
        return idTipoFraude;
    }

    public String getDescricao() {
        return descricao;
    }

}
