public class Administrador {

    private int idAdmin;
    private String nome;
    private String morada;
    private String email;
    private Servidor nServidor;

    public Administrador(int idAdmin, String nome, String morada, String email, Servidor nServidor) {
        this.idAdmin = idAdmin;
        this.nome = nome;
        this.morada = morada;
        this.email = email;
        this.nServidor = nServidor;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Servidor getnServidor() {
        return nServidor;
    }

    public void setnServidor(Servidor nServidor) {
        this.nServidor = nServidor;
    }


}
