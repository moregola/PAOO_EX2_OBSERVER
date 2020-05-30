import java.util.Calendar;
import java.util.Date;

public class Inicio {
    public static void main(String[] args) {

        Editora editora = new Editora();

        editora.addObserver(new Pessoa("José", new Entregavel("Estadao"),"DIARIO"));
        editora.addObserver(new Pessoa("João", new Entregavel("Estadao"),"FDS"));
        editora.addObserver(new Pessoa("Maria", new Entregavel("Marie Claire"), "SEMANAL"));
        editora.Iniciar();
    }
}
