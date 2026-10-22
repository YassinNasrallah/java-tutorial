import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    public static void main(String[] arg){
        int Playerheal = 100;
        boolean isAlive = true;
        // player position
        int x = 0;
        int y = 0;

        // player invetory
        ArrayList<String>Invetory = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        if(isAlive){ 
        // player method
        playyerAction(scanner);
        Playermovement(scanner, x , y);
        }
        addItem(Invetory, scanner);
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


    static void Playermovement(Scanner scanner , int x , int y){
  
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
        Invetory.add(item);
        System.out.println("invetory : " + Invetory);
    }
    
}