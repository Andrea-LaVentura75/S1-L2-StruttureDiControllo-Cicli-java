package Esercizi.esercizio4;

import java.util.Scanner;

public class Esercizio4 {

    static Scanner scanner = new Scanner(System.in);

    public static void contoAllaRovescia(){

        System.out.println("Inserisci un numero:");
        int numero = scanner.nextInt();

        for (int i = numero; i >=0; i--) {
            System.out.println("conto alla rovescia:"+i);
        }
    }

    public static void main(String[] args) {
        contoAllaRovescia(); // Chiama il metodo per avviare il programma
    }
}
