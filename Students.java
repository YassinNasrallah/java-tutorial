import java.util.Scanner;
import java.util.ArrayList;


public class Students {
    public static void main(String[] args) {
        //variables
        boolean running = true; // use it for while loop
        String StudentName;
        String StudentMajor;
        char sex;
        // aray list
        ArrayList<String> StudentsList = new ArrayList<>();

        //creat scanner
        //  Scanner scanner = new Scanner(System.in);

        // while running is true keep ask for students information 
       // while (running) {
         //input student name
        // System.out.print("Enter Student name : ");
        // StudentName = scanner.nextLine();

         // if user want to quit the program he should write 'cancel'
        //if(StudentName.equalsIgnoreCase("Cancel")) {
        //   running = false;
        //} else{
        //     StudentsList.add(StudentName);
        //}
        //}
       // scanner.close();
        //add student to studentsList
       // System.out.print("Students name: " + StudentsList);






       Scanner scanner2 = new Scanner(System.in);

       String OrderName;
       double price;
       int OrderCount;
       double total;
       char symbol = '$';
       System.out.print("Enter Your Order : ");
       OrderName = scanner2.nextLine();
       System.out.print("Order Price : ");
       price = scanner2.nextDouble();
       System.out.print("Order count : ");
       OrderCount = scanner2.nextInt();

        System.out.println("--------Menu--------");
        System.out.println("Oeder name : " +  OrderName);
        System.out.println("Oeder price : " +  price);
        System.out.println("Oeder coumt : " +  OrderCount);
        total = price * OrderCount;
        System.out.println("Total price : " + total + symbol);
        scanner2.close();

        }



        
        
}