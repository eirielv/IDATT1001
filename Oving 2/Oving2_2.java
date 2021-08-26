//Hvilken pakke kjøttdeig er billigst, A eller B (kr = Kr og gram = G)

public class Oving2_2 {
     //Merke A
        static double merkeAKr = 35.90;
        static double merkeAG = 450;
        //Merke B
        static double merkeBKr = 39.5;
        static double merkeBG = 500;
    public static void main(String[] args){
       vinner();
    }
    //Deler kr på g for å finne p/g(PG)
    public static void vinner(){
        double merkeAPG = merkeAKr/merkeAG;
        double merkeBPG = merkeBKr/merkeBG;
        if(merkeAPG > merkeBPG){
            System.out.println("Merke A er billigere!");
        }
        else{System.out.println("Merke B er billigere!");
        }
    }
}