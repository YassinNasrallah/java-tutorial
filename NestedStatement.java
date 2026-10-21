import java.util.Scanner;
import java.util.ArrayList;


public class NestedStatement {
    public static void main(String[] args) {
            
            boolean isStudent = false;
            double price = 39.99;
            boolean isSenior = true;

            if(isStudent){
                if (isSenior) {
                    System.out.println("you got student and senior deal 30%");
                    price *= 0.07;
                } else{
                    System.out.println("you got student deal 20%");
                    price *= 0.08;
                }
            } else if(isSenior){
                    System.out.println("you got  senior deal 10%");
                    price *= 0.09;
            } else{
                    System.out.println("you got paid full price");
                    price *= 1;
            }

            System.out.println(price);

        }



        
        
}