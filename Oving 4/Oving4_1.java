import java.util.Scanner;
public class Oving4_1 {
    
    static Valuta usd = new Valuta("USD", 8.62);
    static Valuta dkk = new Valuta("DKK", 1.36);
    static Valuta eur = new Valuta("EUR", 10.14);
    static int valuta1;
    static double ant;
    static int JaNei;
    
    public static void main (String[] args){
        boolean avslutt = true; 
        // holder programmet i gang
        while(avslutt == true){
        // mens !trykk4 kjør program
           
            System.out.println("Vil du konvertere fra NOK til valutta trykk 1, hvis motsatt, trykk 2");
            Scanner input1 = new Scanner(System.in);
            JaNei = input1.nextInt();
        
            if(JaNei == 1){
                System.out.println("");
                System.out.println("Hva vil du konvertere til: \n 1 USD \n 2 DKK \n 3 EUR \n 4 AVSLUTT \n");
                Scanner input2 = new Scanner(System.in);
                valuta1 = input2.nextInt();

                if(valuta1 == 1){
                    System.out.println("");
                    System.out.println("Hvor mye vil du konvertere. Bruk norsk komma:");
                    Scanner input3 = new Scanner(System.in);
                    ant = input3.nextDouble();
                    System.out.println(ant + " NOK er " + usd.fraNok(ant) + " " + usd.valutaNavn);
                }
                else if(valuta1 == 2){
                    System.out.println("");
                    System.out.println("Hvor mye vil du konvertere. Bruk norsk komma:");
                    Scanner input4 = new Scanner(System.in);
                    ant = input4.nextDouble();
                    System.out.println(ant + " NOK er " + dkk.fraNok(ant) + " " + dkk.valutaNavn);
                }
                else if(valuta1 == 3){
                    System.out.println("");
                    System.out.println("HHvor mye vil du konvertere. Bruk norsk komma:");
                    Scanner input5 = new Scanner(System.in);
                    ant = input5.nextDouble();
                    System.out.println(ant + " NOK er " + eur.fraNok(ant) + " " + eur.valutaNavn);                    
                }
                else if(valuta1 == 4){
                    break;
    
                }
                
            }

            else if(JaNei == 2){
                System.out.println("");
                System.out.println("Hva vil du konvertere fra: \n 1 USD \n 2 DKK \n 3 EUR \n 4 AVSLUTT \n");
                Scanner input6 = new Scanner(System.in);
                valuta1 = input6.nextInt();
                
                if(valuta1 == 1){
                    System.out.println("");
                    System.out.println("Hvor mye vil du konvertere. Bruk norsk komma:");
                    Scanner input7 = new Scanner(System.in);
                    ant = input7.nextDouble();   
                    System.out.println(ant + " " + usd.valutaNavn + " er " + usd.tilNok(ant) + " NOK "); 
                }
                else if(valuta1 == 2){
                    System.out.println("");
                    System.out.println("Hvor mye vil du konvertere. Bruk norsk komma:");
                    Scanner input8 = new Scanner(System.in);
                    ant = input8.nextDouble();
                    System.out.println(ant + " " + dkk.valutaNavn + " er " + dkk.tilNok(ant) + " NOK "); 
                }
                else if(valuta1 == 3){
                    System.out.println("");
                    System.out.println("Hvor mye vil du konvertere. Bruk norsk komma:");
                    Scanner input9 = new Scanner(System.in);
                    ant = input9.nextDouble();
                    System.out.println(ant + " " + eur.valutaNavn + " er " + eur.tilNok(ant) + " NOK ");
                }
                else if(valuta1 == 4){
                    continue;
                }
                
            }       
                
        
        }
            
    }
}

class Valuta {
    String valutaNavn;
    double valutaVerdi;
    public Valuta (String valuta, double verdi){
        this.valutaNavn = valuta;
        this.valutaVerdi = verdi;
    }   //gjøre om til private

    public double fraNok(double ant){
        return ant / this.valutaVerdi;
        
    }
    public double tilNok(double ant){
        return ant * this.valutaVerdi;
    }
}
    