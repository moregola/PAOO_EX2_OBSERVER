import java.util.*;

public class Editora implements Subject {

    Calendar calendar;
    public List<Observer> clientes = new LinkedList<>();

    public Editora() {
        calendar  = Calendar.getInstance();
    }


    public void Iniciar()
    {
        while(!clientes.isEmpty())
        {

            System.out.println("verificando contagem dos dias : " + calendar.getTime());
            for(Observer o : clientes)
            {
                Pessoa pessoa = (Pessoa)o;
                if(pessoa.getProdutoCadastrado().getTipoAssinatura() == "DIARIO")
                {
                    NotifyObserver(o, new Entregavel(pessoa.getProdutoCadastrado().getNome()));
                    if(pessoa.randomCancel() == 0.1)
                    {
                        removeObserver(o);
                        break;
                    }
                }
                else if(pessoa.getProdutoCadastrado().getTipoAssinatura() == "SEMANAL")
                {
                    if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
                    {
                        NotifyObserver(o, new Entregavel(pessoa.getProdutoCadastrado().getNome()));
                        if(pessoa.randomCancel() == 0.1)
                        {
                            removeObserver(o);
                            break;
                        }

                    }
                }
                else if(pessoa.getProdutoCadastrado().getTipoAssinatura() == "FDS") {
                    if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
                            || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
                    {
                        NotifyObserver(o, new Entregavel(pessoa.getProdutoCadastrado().getNome()));
                        if(pessoa.randomCancel() == 0.1)
                        {
                            removeObserver(o);
                            break;

                        }
                    }
                }
            }
            calendar.add(Calendar.DATE,1);
        }
        System.out.println("Falimos!!!!");
    }

    @Override
    public void addObserver(Observer o) {

        clientes.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        clientes.remove(o);
        System.out.println("Cancelou!");

    }
    @Override
    public void NotifyObserver(Observer o, Entregavel entregavel) {
            o.update(entregavel);
    }

}
