import java.util.Random;

public class minRandom{
    static Random tall = new Random();
    public static void main(String[] args) {
        for (int i = 0; i<20; i++){
            System.out.println(nesteHeltall(10, 40));
            System.out.println(nesteDesimaltall(3,8));
        }
    }
    public static int nesteHeltall(int nedre, int ovre){
        return tall.nextInt(ovre - nedre + 1) + nedre;
    }
    public static double nesteDesimaltall(double nedre, double ovre){
        return tall.nextDouble() * (ovre - nedre) + nedre;

    }

}