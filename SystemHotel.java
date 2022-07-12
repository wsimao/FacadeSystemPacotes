import java.util.ArrayList;

public class SystemHotel extends SystemPagamento {

    ArrayList<Integer> reserva = new ArrayList<>();

    public void confirmaarReservaUh(){
        System.out.println("Reserva Confirmada");
        pagamentoConfirmado();
        reserva.add(1);
    }
    
    public void cancelarReservaUh(){
        System.out.println("Reserca Cancelada");
        pagamentoEstorno();
        reserva.remove(0);
    }
    
}
