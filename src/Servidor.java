public class Servidor {

    private int idServidor;
    private int capacidade;
    private int Localizacao;
    private String tipo;
    private Administrador admin;

    public Servidor(int idServidor, int capacidade, int localizacao, String tipo, Administrador admin) {
        this.idServidor = idServidor;
        this.capacidade = capacidade;
        Localizacao = localizacao;
        this.tipo = tipo;
        this.admin = admin;
    }

    public int getIdServidor() {
        return idServidor;
    }

    public void setIdServidor(int idServidor) {
        this.idServidor = idServidor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(int localizacao) {
        Localizacao = localizacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

}
