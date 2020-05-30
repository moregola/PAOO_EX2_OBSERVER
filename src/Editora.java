import java.util.*;

public class Editora implements Subject {

    Calendar calendar;
    public List<Pessoa> clientes = new LinkedList<>();

    public Editora() {
        calendar = Calendar.getInstance();
    }


    public void Iniciar() {
        while (!clientes.isEmpty()) {

            System.out.println("verificando contagem dos dias : " + calendar.getTime());
            for (Pessoa pessoa : clientes) {
                if (pessoa.getTipoAssinatura()  == "DIARIO") {
                    NotifyObserver(pessoa, pessoa.getProduto());
                    if (new Random().nextInt(100) == 10) {
                        removeObserver(pessoa);

                        break;
                    }
                } else  if (pessoa.getTipoAssinatura()  == "SEMANAL") {
                    if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                        NotifyObserver(pessoa, pessoa.getProduto());
                        if (new Random().nextInt(100) == 10) {
                            removeObserver(pessoa);

                            break;
                        }

                    }
                } else  if (pessoa.getTipoAssinatura() == "FDS") {
                    if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
                            || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                        NotifyObserver(pessoa, pessoa.getProduto());
                        if (new Random().nextInt(100) == 10) {
                            removeObserver(pessoa);

                            break;

                        }
                    }
                }
            }
            calendar.add(Calendar.DATE, 1);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Falimos!!!!");
    }

    @Override
    public void addObserver(Observer o) {

        System.out.println("Cancelou!");
        clientes.add((Pessoa) o);
    }

    @Override
    public void removeObserver(Observer o) {

        clientes.remove(o);


    }

    @Override
    public void NotifyObserver(Observer o, Entregavel conteudo) {
        o.update(conteudo);
    }

}
