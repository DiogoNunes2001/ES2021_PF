public class Copia  {

    private int idCopia;
    private String cota;
    private eBook eb;
    private Servidor sv;

    public Copia(int idCopia, String cota, eBook eb, Servidor sv) {
        this.idCopia = idCopia;
        this.cota = cota;
        this.eb = eb;
        this.sv = sv;
    }

    public int getIdCopia() {
        return idCopia;
    }

    public void setIdCopia(int idCopia) {
        this.idCopia = idCopia;
    }

    public String getCota() {
        return cota;
    }

    public void setCota(String cota) {
        this.cota = cota;
    }

    public eBook getEb() {
        return eb;
    }

    public void setEb(eBook eb) {
        this.eb = eb;
    }

    public Servidor getSv() {
        return sv;
    }

    public void setSv(Servidor sv) {
        this.sv = sv;
    }

}
