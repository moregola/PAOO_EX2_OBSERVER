public class Pessoa implements Observer {

    private String nome;
    private String tipoAssinatura;
    private Entregavel produto;


    public Pessoa(String nome,Entregavel produto, String tipoAssinatura) {
        this.nome = nome;
        this.produto = produto;
        this.tipoAssinatura = tipoAssinatura;
    }

    public String getNome() {
        return this.nome;
    }
    public String getTipoAssinatura() {
        return this.tipoAssinatura;
    }
    public Entregavel getProduto() {
        return this.produto;
    }

    @Override
    public void update(Entregavel entregavel) {
        System.out.println("Produto Entregue: " + entregavel.retornaConteudo() + " - Para: " + this.nome);

    }




}
