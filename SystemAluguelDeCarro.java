import java.util.ArrayList;

public class SystemAluguelDeCarro extends SystemPagamento {

    ArrayList<Integer> carros = new ArrayList<Integer>();

    public void alugarCarro(){
        System.out.println("Carro alugado");
        pagamentoConfirmado();
        carros.add(1);
    }

    public void devolverCarro(){
        System.out.println("Carro devolvido");
        pagamentoEstorno();
        carros.remove(0);

    }


    
}
