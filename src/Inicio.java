import java.util.Calendar;
import java.util.Date;

public class Inicio
{
    public static void main(String[] args) {

        Date dayNow = Calendar.getInstance().getTime();
        Produto estadao = new Produto("Estado Diario","DIARIO");
        Produto estadaoFinalSemana = new Produto("Estado Final de Semana","FDS");
        Produto marieClarie = new Produto("Marie Clarie","SEMANAL");

        Editora editora = new Editora();

        editora.addObserver(new Pessoa("José", estadao));
        editora.addObserver(new Pessoa("João", estadaoFinalSemana));
        editora.addObserver(new Pessoa("Maria", marieClarie));
        editora.Iniciar();
    }
}
