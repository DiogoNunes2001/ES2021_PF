public class Utilizador {

    private String NumMec;
    private String nome;
    private String localidade;
    private String email;
    private TipoUtilizador tipo;

    public Utilizador(String numMec, String nome, String localidade, String email, TipoUtilizador tipo) {
        this.NumMec = numMec;
        this.nome = nome;
        this.localidade = localidade;
        this.email = email;
        this.tipo = tipo;
    }


    public TipoUtilizador getTipoUtilizador() {
        return tipo;
    }

    public String getNumMec() {
        return NumMec;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getEmail() {
        return email;
    }

    public void setNumMec(String numMec) {
        NumMec = numMec;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipo(TipoUtilizador tipo) {
        this.tipo = tipo;
    }

}
