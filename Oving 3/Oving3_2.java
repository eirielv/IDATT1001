  import java.util.Scanner;
  public class Oving3_2 {
     public static void main(String[] args){
         Scanner num = new Scanner(System.in);
         Scanner input = new Scanner(System.in);
         boolean conten = true;
         while(conten){
         System.out.print("Skriv et tall: \n" );
         int tall = num.nextInt();
      if(primtallKalkulator(tall)){
        System.out.println(tall + " er et primtall!");
    }
    else{
        System.out.println(tall + " er ikke et primtall!");
    }
      System.out.println("Vil du fortsette? Y,N");
      String choice = input.nextLine();
      if(choice.equals("N")) conten = false;
         }
         num.close();
         input.close();
    }
    public static boolean primtallKalkulator(int tall){
        for(int i = 2; i < tall; i++){
            if(tall % i == 0){
                return false;
                
            } 
                   
        }
        return true;
        
          
    }

}
