package Esercizi.esercizio3;

import java.util.Scanner;

public class Esercizio3 {

    public static void stringaConVirgole() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci una stringa (digita :q per uscire):");
            String stringa = scanner.nextLine();

            if (stringa.equals(":q")) { // Controlla se l'utente vuole uscire
                System.out.println("Uscita dal programma.");
                break; // Esce dal ciclo
            }

            // Dividere ogni carattere con una virgola
            String risultato = String.join(",", stringa.split(""));

            // Stampa il risultato
            System.out.println("Stringa con virgole: " + risultato);
        }

        scanner.close(); // Chiude lo scanner
    }

    public static void main(String[] args) {
        stringaConVirgole(); // Chiama il metodo per avviare il programma
    }
}
