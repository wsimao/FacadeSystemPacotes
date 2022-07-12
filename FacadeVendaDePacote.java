import java.util.Scanner;

public class FacadeVendaDePacote {

    SystemAluguelDeCarro carro = new SystemAluguelDeCarro();
    SystemAereo aereo = new SystemAereo();
    SystemHotel hotel = new SystemHotel();

    Scanner scanner = new Scanner(System.in);

    public void aluguelCarro(){
        carro.carros.add(0);
        System.out.println("Deseja alugar ou devolver o carro?");
        System.out.println("[1] Alugar");
        System.out.println("[2] Devolver");
        System.out.println("**Digite a opção que deseja?**");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                carro.alugarCarro();
                break;
            case 2:
                carro.devolverCarro();
                break;
            default: System.out.println("Opção inválida");
                break;
        }
    }

    public void reservaHotel(){
        hotel.reserva.add(0);
        System.out.println("Deseja reservar ou cancelar a reserva?");
        System.out.println("[1] Reservar");
        System.out.println("[2] Cancelar");
        System.out.println("**Digite a opção que deseja?**");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                hotel.confirmaarReservaUh();
                break;
            case 2:
                hotel.cancelarReservaUh();
                break;
            default: System.out.println("Opção inválida");
                break;
        }
    }

    public void passagemAerea(){
        aereo.assentos.add(0);
        System.out.println("Deseja comprar ou cancelar a passagem?");
        System.out.println("[1] Comprar");
        System.out.println("[2] Cancelar");
        System.out.println("**Digite a opção que deseja?**");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                aereo.comprarPassagem();
                break;
            case 2:
                aereo.cancelarPassagem();
                break;
            default: System.out.println("Opção inválida");
                break;
        }
    }


}