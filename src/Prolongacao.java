public class Prolongacao  {

    private int idProlongacao;
    private String nome;
    private String morada;
    private String email;
    private Emprestimo emprestimo;

    public Prolongacao(int idProlongacao, String nome, String morada, String email, Emprestimo emprestimo) {
        this.idProlongacao = idProlongacao;
        this.nome = nome;
        this.morada = morada;
        this.email = email;
        this.emprestimo = emprestimo;
    }

    public int getIdProlongacao() {
        return idProlongacao;
    }

    public void setIdProlongacao(int idProlongacao) {
        this.idProlongacao = idProlongacao;
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

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }



}
