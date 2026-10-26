import java.util.Random;

public class Eenemy {
   // scop variables

    // enemy position
    static  int x = 0;
   static  int y = 0;

    // enemy health
    static  int enemyHealth = 100;

    // is alive ; true / false
    static boolean isAlive = true;

    // enemy choices
    static String[] enemyChoices = {"attack", "defend", "heal"};
    static String[] enemyMovement = {"top", "bottom", "left", "rigth"};

    public static void main(String[] arg){
        Random random = new Random();
        if(isAlive){
          Aimovemnt(enemyMovement,random);
          Aichoices(enemyChoices,random);
          DealwithDamage(isAlive ,enemyHealth);
        }
       

    }

    static void Aimovemnt(String[] enemyMovement, Random random){
        int index = random.nextInt(enemyMovement.length);
        String movement = enemyMovement[index];
        switch (movement) {
            case "top" -> y++;
            case "bottom" -> y--;
            case "left" -> x--;
            case "rigth" -> x++;
        }
        System.out.println("movement : " + movement);
        System.out.println("position : (" + x + ", " + y + ")");
       
    }

    static void Aichoices(String[] enemyChoices,Random random){
        int index = random.nextInt(enemyChoices.length);
        String action = enemyChoices[index];
        System.out.println("Enemy action : " + action);
       
    }

    static  void DealwithDamage(boolean isAlive, int enemyHealth){
        if(enemyHealth <= 0){
            isAlive = false;
        }
    }

}