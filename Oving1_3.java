public class Oving1_3 {
    public static void main(String[] args){
        sekund(108_980); 
    }
    public static void sekund(int sek){
        int timer = sek /(60*60);
        int minutter = sek %(60*60)/60;
        int sekunder = sek %(60*60)%60;
System.out.println(timer + " timer,"+ minutter + " minutter og " + sekunder + " sekunder!");
    }
}