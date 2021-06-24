public class ePub extends eBook{

    private String config;

    public ePub(int hash, int tamanho, Livro l, String nome, String tipo, String config) {
        super(hash, tamanho, l, nome, tipo);
        this.config = config;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
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
