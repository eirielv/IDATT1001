public class Valuta{
    private double kurs; // 1 fremmed = kurs NOK
    private String navn;
//ved private så vil ikke verdien kunne endres

    public Valuta(String navn, double kurs){
//Lager konstruktør. Oppgaven er å gi verdier til variablene over
//public fordi man skal kunne bruke den utenfor valutaklassen
        this.navn = navn;
        this.kurs = kurs;
//this.navn er referanse til private String navn, hvis ikke this. så hadde den brukt navn som står inni konstruktør
//this.navn = navn(viser til konstruktør)
    }

    public double tilNok(double mengde){
//METODE
//Trenger informasjon inni '()'. Trenger da mengden
        return mengde * kurs;
//Må ha return, hvis ikke metoden er en void
    }
    public double fraNok(double mengde){
//METODE
        return mengde / kurs;
    }

    public String getNavn() {
        return this.navn;
    //Returnerer navn fra Valutak klasse
    }

}