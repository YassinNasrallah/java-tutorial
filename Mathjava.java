import java.util.Scanner;

public class Mathjava {

    public static void main(String[] args){


     // Compound interest 

      Scanner scanner = new Scanner(System.in);

      // Compound interest formula:
     // A = P * (1 + r / n) ^ (n * t)
         
      double P ; //principal
      double r ; // rate
      int n; // timesCompounded
      int t ; // years
      double A; // amount
      


      // user input
      System.out.print("Enter principal amount : ");
      P = scanner.nextDouble();

      System.out.print("Enter interest rate : ");
      r = scanner.nextDouble() / 100;

      System.out.print("Enter times Compounded");
      n = scanner.nextInt();
      
      System.out.print("Enter how many years you leave your money in the bank : ");
      t = scanner.nextInt();
      
      // problem solution
      A = P * Math.pow(1 + r / n, n * t) ;

      System.err.println("Amount After: " + t + " is " + A + "$") ;

      scanner.close();


      
    }
}