import java.util.Calendar;
public class Produto {

        private String Nome;
        private String TipoAssinatura;
    public Produto(String nome, String tipoAssinatura) {
        this.Nome = nome;
        this.TipoAssinatura = tipoAssinatura;
    }
    public String getTipoAssinatura()
    {
            return this.TipoAssinatura;
    }
    public String getNome()
    {
        return this.Nome;
    }
}
