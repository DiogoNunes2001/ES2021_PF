
import java.util.ArrayList;

public class Repositorio {


    private ArrayList<Administrador> administradores;
    private ArrayList<Copia> copias;
    private ArrayList<eBook> eBooks;
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Fraude> fraudes;
    private ArrayList<Notificacao> notificacoes;
    private ArrayList<Prolongacao> prolongacoes;
    private ArrayList<Servidor> servidores;
    private ArrayList<TipoFraude> tipoFraudes;
    private ArrayList<TipoUtilizador> tipoUtilizadores;
    private ArrayList<Utilizador> utilizadores;

    public Repositorio() {
        this.administradores = new ArrayList<>();
        this.copias = new ArrayList<>();
        this.eBooks = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
        this.fraudes = new ArrayList<>();
        this.notificacoes = new ArrayList<>();
        this.prolongacoes = new ArrayList<>();
        this.servidores = new ArrayList<>();
        this.tipoFraudes = new ArrayList<>();
        this.tipoUtilizadores = new ArrayList<>();
        this.utilizadores = new ArrayList<>();
    }

    public void addAdmins (Administrador admin) {
        administradores.add(admin);
    }
    public void addCopias (Copia copia) {
        copias.add(copia);
    }
    public void addeBook (eBook e) {
        eBooks.add(e);
    }
    public void addEmprestimo (Emprestimo emp) {
        emprestimos.add(emp);
    }
    public void addFraude (Fraude fraude) {
        fraudes.add(fraude);
    }
    public void addNotificacao(Notificacao notif) {
        notificacoes.add(notif);
    }
    public void addProlongacao(Prolongacao prolong) {
        prolongacoes.add(prolong);
    }
    public void addServer(Servidor sv) {
        servidores.add(sv);
    }
    public void addTipoFraude (TipoFraude tf) {
        tipoFraudes.add(tf);
    }
    public void addTipoUser (TipoUtilizador tu) {
        tipoUtilizadores.add(tu);
    }
    public void addUser (Utilizador u) {
        utilizadores.add(u);
    }
}
