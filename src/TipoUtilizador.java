public class TipoUtilizador {

    private int idTipo;
    private int prazoEmp;
    private int Prolongacoes;

    public TipoUtilizador(int idTipo, int prazoEmp, int prolongacoes) {
        this.idTipo = idTipo;
        this.prazoEmp = prazoEmp;
        this.Prolongacoes = prolongacoes;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public int getPrazoEmp() {
        return prazoEmp;
    }

    public int getProlongacoes() {
        return Prolongacoes;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public void setPrazoEmp(int prazoEmp) {
        this.prazoEmp = prazoEmp;
    }

    public void setProlongacoes(int prolongacoes) {
        Prolongacoes = prolongacoes;
    }


}
