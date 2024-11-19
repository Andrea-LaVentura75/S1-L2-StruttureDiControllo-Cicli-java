package Esercizi.esercizio1;

public class Esercizio1 {

    public static boolean numeroCaratteri(String stringa){
        if(stringa.length()%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean annoBisestile(int anno){
        if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)){
            System.out.println("l'anno è bisestile");
            return true;
        }else{
            System.out.println("l'anno non è bisestile");
            return false;
        }
    }


    public static void main(String[] args) {
        // pariDispari
        String esempio = "tes";
        boolean risultato = numeroCaratteri(esempio);
        System.out.println("La stringa \"" + esempio + "\" ha un numero di caratteri pari? " + risultato);

        //annoBisestile
        annoBisestile(2000);
    }

}





