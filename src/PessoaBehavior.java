import java.util.Random;

public abstract class PessoaBehavior implements Observer{
    private String nome;
    private Produto produto;

    public PessoaBehavior(String nome) {
        this.nome = nome;
    }
    public PessoaBehavior(String nome, Produto produto) {
        this.nome = nome;
        this.produto = produto;
    }

    String getNome()
    {
        return nome;
    }

    Produto getProdutoCadastrado()
    {
        return produto;
    }
    public double randomCancel()
    {
        Random gerador = new Random();
        double n = ((double)(gerador.nextInt(10)+1)/10);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return n;
    }

}
