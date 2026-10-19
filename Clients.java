import java.util.Random;
import java.util.Scanner;

public class Clients {
    public static void main(String[] arg) {
  
       String[] coin = {"king", "castle"};
       String UserCoin;
       boolean winner;
       Random random2 = new Random();
       UserCoin = coin[random2.nextInt(coin.length)];
       
       if(UserCoin.equals("king")){
        System.out.println(UserCoin);
        System.out.println("player win !!!");
        winner = true;
       } else{
        System.out.println(UserCoin);
        System.out.print("player lose");
        winner = false;
       }
       




       
    }
}
