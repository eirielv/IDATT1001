public class Oving1_2 {
    public static void main(String[] args){
        utregning(4, 3, 2);
    }
    public static void utregning(int timer, int minutter, int sekunder){
        int sekunderTilSammen = (timer*60*60)+(minutter*60)+sekunder;
        System.out.println("Det blir til sammen " + sekunderTilSammen);
    }
}