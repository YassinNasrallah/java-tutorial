import java.util.ArrayList;
import java.util.Scanner;

public class Player {
        static int Playerheal = 100;
        static boolean isAlive = true;
        // player position
        static int x = 0;
        static  int y = 0;

       static  ArrayList<String>Invetory = new ArrayList<>();
    public static void main(String[] arg){

        // player invetory
        
        
        Scanner scanner = new Scanner(System.in);
        if(isAlive){ 
        // player method
        playyerAction(scanner);
        Playermovement(scanner);
        }
        addItem(Invetory, scanner);
        getItem(Invetory, scanner);
         scanner.close();
    }

    static void playyerAction(Scanner scanner ){
       
        // player action
        String PlayerAction;

        // player input
        System.err.println("enter player Action : ");
        System.out.println("Attack / heal / defend");
        PlayerAction = scanner.nextLine();

            switch (PlayerAction) {
            case "attack" -> System.err.println("Player is attack");
            case "defend" -> System.err.println("Player is defend");
            case "heal" -> System.err.println("Player is healing");
            default ->  System.err.println("Player has no action");
        }
      
    }


    static void Playermovement(Scanner scanner ){
  
         String playerMovemnt;
  
         System.out.println("move options : ");
         System.out.println("Rigth / left / bottom / top");

         playerMovemnt = scanner.nextLine();
         
         switch (playerMovemnt) {
            case "Rigth" -> x++;
            case "left" -> x--;
            case "bottom" -> y--;
            case "top" -> y++; 
         }
         System.out.println("Player position: (" + x + ", " + y + ")");
    }

    static void addItem(ArrayList<String> Invetory, Scanner scanner){
        String item;
        System.out.println("add item to invetory : ");
        item = scanner.nextLine();
        
        if(item!=""){
             Invetory.add(item);
             System.out.println("invetory : " + Invetory);
        } else {
             System.out.println("empty !!!");
        }
    }

    static void getItem(ArrayList<String> Invetory,Scanner scanner){
           String target;
           System.out.println("get the item : ");
           target = scanner.nextLine();
          if(Invetory.contains(target)){
            System.out.println("item is : " + target);
          } else {
            System.out.println("item not found ");
          } 
    }
    
}