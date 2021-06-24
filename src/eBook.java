public class eBook {

    private int hash;
    private int tamanho;
    private Livro l;
    private String nome;
    private String tipo;

    public eBook(int hash, int tamanho, Livro l, String nome, String tipo) {
        this.hash = hash;
        this.tamanho = tamanho;
        this.l = l;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Livro getL() {
        return l;
    }

    public void setL(Livro l) {
        this.l = l;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
