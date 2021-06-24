public class Pdf extends eBook{

    public Pdf(int hash, int tamanho, Livro l, String nome, String tipo) {
        super(hash, tamanho, l, nome, tipo);
    }

    @Override
    public int getHash() {
        return super.getHash();
    }

    @Override
    public void setHash(int hash) {
        super.setHash(hash);
    }

    @Override
    public int getTamanho() {
        return super.getTamanho();
    }

    @Override
    public void setTamanho(int tamanho) {
        super.setTamanho(tamanho);
    }

    @Override
    public Livro getL() {
        return super.getL();
    }

    @Override
    public void setL(Livro l) {
        super.setL(l);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }
}
