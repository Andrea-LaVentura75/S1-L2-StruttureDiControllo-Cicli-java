package Esercizi.esercizio2;

public class Esercizio2 {

    public static void stampaNumero(int numero){
        switch (numero){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;

            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("il numero non è compreso");
                break;
        }
    }

    public static void main(String[] args) {
     stampaNumero(0);
    }
}
