public class Oving3_11{
    public static void main(String[] args){
        tall();
    }
   public static void tall(){
       int tall1 = 13;
       int tall2 = 16;
       for(int o = tall1; o < (tall2 + 1); o++){
        int i = 1; 
       
       do{System.out.println(o + " x " + i + " = " + (o * i));i++;
        }
        while(i<=10);
        System.out.println("\n");
    }
   }
}
