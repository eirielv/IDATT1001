import java.util.Random;
import java.util.Scanner;

public class Oving4_2 {
    public static void main(String[] args) {
        boolean avslutte = true;
        while(avslutte){
            Spiller A = new Spiller();
            Spiller B = new Spiller();

            while(A.erFerdig() == false && B.erFerdig() == false){
                A.kastTerning();
                B.kastTerning();
                System.out.println("Etter runde " + A.getRunde() + " så har Spiller A " + A.getPoeng());
                System.out.println("Etter runde " + B.getRunde() + " så har Spiller B " + B.getPoeng() + "\n");
            }
            if(A.erFerdig() == true){
                System.out.println("Spiller A vant etter " + A.getRunde() + " runder!");
            }else if(B.erFerdig() == true){
                System.out.println("Spiller B vant etter " + B.getRunde() + " runder!");
            }
            System.out.println("Vil du kjøre på nytt: trykk 1. Avslutt: trykk2");
            Scanner input = new Scanner(System.in);
            int valg = input.nextInt();
            if(valg == 2){ 
                avslutte = false; 
                break;
            } else{
                continue;
            }

        }   
    }
        
}


//Slutt på Main Klassen

class Spiller{  
int poeng;
int runde;

//konstruktør
    public Spiller(){
        poeng = 0;
        runde = 0;
    }

    public int getRunde(){
        return runde;
    }

    public int getPoeng(){
        return poeng;
    }
// selve spillet

    public int kastTerning(){
        Random terning = new Random();
        int terningkast = terning.nextInt(6) + 1;
        
        
// de tre forskjellige tilfellene ved poenggivning
        if (terningkast == 1){
            poeng = 0;
            runde += 1;
        } else if(poeng < 100){
            poeng += terningkast;
            runde += 1;
        } else{
            poeng -= terningkast;
            runde += 1;
        } 
        return poeng & runde;
        
    }
    //Sjekker om spiller har vunet
    public boolean erFerdig(){
        if(poeng == 100){
            return true;
        } else{
            return false;
        }
    }
}

