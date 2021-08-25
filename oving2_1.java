public class oving2_1 {
    //Finne ut om årstall er et skuddår

    public static void main(String[] args){
        //skriv inn årstall
        arstall(2020);
    }
    public static void arstall(int ar){
        //Finner ut om det er hundreår
        if(ar % 100 == 0){
            //Hvis hundreår % 400 = 0, så hundreår
            if(ar % 400 ==0){
                System.out.println("Skuddår");
            }
            else{
                System.out.println("IKKE SKUDDÅR!");
            }
        }
        //Hvis ikke hundreår, år modulo 4
        else{
            if(ar % 4 ==0){
                System.out.println("Skuddår");
            }
            //Hvis ingen desimal -> skuddår, hvis desimal ikke skuddår
            else{
                System.out.println("IKKE SKUDDÅR!");
            }

        }

    } 

}

