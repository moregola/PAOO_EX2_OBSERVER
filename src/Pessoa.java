import java.util.Random;

public class Pessoa implements Observer {

    private String nome;
    private Produto produto;
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, Produto produto) {
        this.nome = nome;
        this.produto = produto;
    }
    public String getNome()
    {
        return this.nome;
    }
    @Override
    public void update(Entregavel entregavel) {
        System.out.println("Produto Entregue: "+ entregavel.getConteudo() + " - Para: " + this.nome);

    }
    public Produto getProdutoCadastrado()
    {
        return this.produto;
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
