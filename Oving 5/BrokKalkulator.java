import java.util.Scanner;

public class BrokKalkulator{
    public static void main(String[] args) {
    //initialiserer konstruktørene
    

        System.out.println("\n Skriv inn (*teller,nevner*) (operasjon) (*teller* ) \n operasjoner er \'* : gange\', \'/ : dele\', \'+ : addere\', \'- : dividere\' \n et eksempel: (2,3) * 4");

        Scanner scanner = new Scanner(System.in);
        String regnStykke = scanner.nextLine();
        
        //lager scanner for å hente operasjon
        //Finn ut hva tellerne og nevner er og declare objekter: brøk1 = new RegnBrøk(teller, nevner);

        if(regnStykke.indexOf("*") != -1){
            System.out.println("djsjkskjds");
            // brøk1.MultipliserBrøk(brøk2);
            //regnStykke.MultipliserBrøk();
        }
        // }else if(regnStykke.indexOf("+" != -1)){

        // }
        // else if(regnStykke.indexOf("-" != -1)){

        // }
        // else if(regnStykke.indexOf("/" != -1)){

        // }
        
    }
}

class RegnBrøk{
    private int teller;
    private int nevner;

    //konstruktører
    public RegnBrøk(int teller, int nevner){
        if(nevner == 0){
            throw new IllegalAccessError("Kan ikke sette nevner = 0");
        }else{
            this.nevner = nevner;
            this.teller = teller;
        }
    }
    public RegnBrøk(int teller){
        this.nevner = 1;

    //Utregninger av brøk
    }
    public void SummerBrøk(){
        // brøk 1 (teller og nevner) + brøk 2 (teller og 1) gange med nevner til brøk1
    }
    public void SubtraherBrøk(){

    }
    public void MultipliserBrøk(){
        brøk1
    }
    public void DeriverBrøk(){

    }
}