public class Inventory {

    static String[] Items = {"Medkit", "Pistol Ammo", "bottle", "Medkit", "Crafting Parts", "Medkit"};
    public static void main(String[] args) {
         displayInvetory();
         System.out.println("Patol Ammo " + countPistolAmmo());
         System.out.println("Medkit " + countMedkits());
         hasItem("Rifle");
    }

    static void displayInvetory(){
        System.out.println("---Player Invetory ---");
        for(String Item : Items){
            System.out.println(Item);
        }
    } 

    static int countMedkits(){
        int counter = 0;
        for (String item : Items) {
            if(item .equals("Medkit")){
               counter ++ ;
            }
        } return  counter;
    }
    static int countPistolAmmo(){
        int counter = 0;
        for (String item : Items) {
            if(item .equals("Pistol Ammo")){
               counter ++ ;
               
            }
        } 
        return  counter;
    }

    static boolean hasItem(String itemName){
              
            if(Items.equals(Items)){
                System.out.println("item found");
              return true;
            } else{
               System.out.println("item not found");
               return  false;
            }
        
    }
    
}
