import java.util.ArrayList;

public class SystemPagamento {

    ArrayList payment = new ArrayList<>();

    public void pagamentoConfirmado(){
        System.out.println("***Transação realizada com sucesso***");
        payment.add(payment);
    }

    public void pagamentoEstorno(){
        System.out.println("***Estorno realizado com sucesso***");
        payment.remove(payment);
    }
    
}
