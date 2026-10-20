import java.util.Scanner;

public class Mathjava {

    public static void main(String[] args){

        // Create a Scanner to read the user's input
        // Ask the user to enter a value for x
        // Read the value of x
        // Check if the denominator is equal to zero
        // If the denominator is zero, print that the function is undefined
        // Otherwise, calculate f(x) = (x² + 3x - 4) / (x - 1)
        // Print the result
        

        //varaible
        int x;
        int result;


        Scanner scanner = new Scanner(System.in);
           
        System.out.print("Enter the value of X : ");
        x = scanner.nextInt();
        
        scanner.close();


        if(result == 0){
           System.out.println("is undifeind");
        } else if(result > 0){
            System.out.println("we got two solution");
            int delta = Math.pow(b, 2) - 4*a*c ;
        } else{
            System.out.println("we got one solution");
        }
      

         
         

    }
}