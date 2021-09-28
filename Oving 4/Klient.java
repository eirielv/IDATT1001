public class Klient {
    public static void main(String[] args) {
        Valuta dollar = new Valuta("dollar", 9.0);
        Valuta euro = new Valuta("eur", 7.0);
        Valuta yen = new Valuta("yen", 0.08);

//TODOBRUKERUNPUT - VELG VALUTA
        int valutaValg = 1;
        Valuta valgtValuta = new Valuta("fisk",0.9);
        //Tar å lager en valutatype til
        //Vofri da kan man si at Valuta er (valuta)

        switch(valutaValg){
            case 1: {
                valgtValuta = dollar;
                break;
            }
            case 2: {
                valgtValuta = euro;
                break;
            }
            case 3: {
                valgtValuta = yen;
                break;
            }
            default: {
            //default er hvis noen andre verdier er trykket inn
                System.exit(0);
                //avslutter programmet
                break;
            }
        }

        //TODO: BRUKERINPUT - MENGDE
        double mengde = 100.0;

        //TODO: BRUKERINPUT - Til/Fra
        boolean tilNok = true;

        if(tilNok){
            System.out.println(mengde + " " + ((Valuta) valgtValuta).getNavn() + " er " + valgtValuta.tilNok(mengde));
        }
        else {

        }
    }
}
