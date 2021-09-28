import java.util.Scanner;

public class BrokOppgave {
    public static void main(String[] args) {
        
        System.out.println("\n Hvilken operasjon ønsker du å utføre: 1 dividere, 2 multiplisere, 3 addere, 4 dividere?");
        Scanner input1 = new Scanner(System.in);
        double operasjon = input1.nextDouble();

        System.out.println("\n Skriv inn teller på første brøk");
        Scanner input2 = new Scanner(System.in);
        double førsteTeller = input2.nextDouble();

        System.out.println("\n Skriv inn nevner på første brøk");
        Scanner input3 = new Scanner(System.in);
        double førsteNevner = input3.nextDouble();
        
        System.out.println("\n Skriv inn teller på andre brøk");
        Scanner input4 = new Scanner(System.in);
        double andreTeller = input4.nextDouble();

        System.out.println("\n Skriv inn teller på andre brøk");
        Scanner input5 = new Scanner(System.in);
        double andreNevner = input5.nextDouble();

        Brøk brøk1 = new Brøk(førsteTeller, førsteNevner);
        Brøk brøk2 = new Brøk(andreTeller, andreNevner);
        // Brøk brøk3 = new Brøk(andreTeller);
        System.out.println(brøk1);
        if(operasjon == 1){
            brøk1.dividerBrøk(brøk2);
            System.out.println(brøk1);
        }else if(operasjon == 2){
            brøk1.multipliserBrøk(brøk2);
        }else if(operasjon == 3){
            brøk1.addereBrøk(brøk2);
        }else if(operasjon == 4){
            brøk1.subtraherBrøk(brøk2);
        }
            
    }
}

class Brøk{
private double teller;
private double nevner;

    //konstruktør
    public Brøk(double teller, double nevner){
        if(nevner == 0){
            throw new IllegalAccessError("Kan ikke sette nevner = 0");
        }else{
            this.nevner = nevner;
            this.teller = teller;
        }
    }

    public Brøk(double teller){
        this.nevner = 1;
        this.teller = teller;

    }
    //Utregninger av brøk
    public void addereBrøk(Brøk brøk2){
        double tellRes = (this.teller * brøk2.nevner) + (brøk2.teller * this.nevner);
        double nevnRes = (this.nevner * brøk2.nevner);
        System.out.println(this.teller + "/" + this.nevner + " + " + brøk2.teller + "/" + brøk2.nevner + " = " + tellRes + "/" + nevnRes);
        //this.nevner = nevnerRes
        //this.teller = tellerRes
    }
    public String toString(){
        return this.teller + "/"+this.nevner;
    }
    public void subtraherBrøk(Brøk brøk2){
        double tellRes = (this.teller * brøk2.nevner) - (brøk2.teller * this.nevner);
        double nevnRes = (this.nevner * brøk2.nevner);
        System.out.println(this.teller + "/" + this.nevner + " - " + brøk2.teller + "/" + brøk2.nevner + " = " + tellRes + "/" + nevnRes);
    }
    public void multipliserBrøk(Brøk brøk2){
        double tellRes = (this.teller * brøk2.teller);
        double nevnRes = (this.nevner * brøk2.nevner);
        System.out.println(this.teller + "/" + this.nevner + " * " + brøk2.teller + "/" + brøk2.nevner + " = " + tellRes + "/" + nevnRes); 
    }
    public void dividerBrøk(Brøk brøk2){
        double tellRes = (this.teller * brøk2.nevner);
        double nevnRes = (this.nevner * brøk2.teller);
        System.out.println(this.teller + "/" + this.nevner + " / " + brøk2.teller + "/" + brøk2.nevner + " = " + tellRes + "/" + nevnRes);
    }

}
