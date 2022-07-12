import java.util.ArrayList;

public class SystemAereo extends SystemPagamento {

    ArrayList<Integer> assentos = new ArrayList<>();

    public void comprarPassagem(){
        System.out.println("Passagem comprada");
        pagamentoConfirmado();
        assentos.add(1);
    }

    public void cancelarPassagem(){
        System.out.println("Passagem cancelada");
        pagamentoEstorno();
        assentos.remove(0);
    }
}
