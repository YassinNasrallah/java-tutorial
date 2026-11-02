import java.lang.classfile.ClassFile.Option;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg){

    Player player = new Player();
    System.err.println(player.Invetory);

    String[] invetory = {"sword", "shield", "arrow"};
    String[] setting = {"save", "load", "exit"};
     
    // 2d array
    String[][] gameOptions={invetory, setting};
    

    char[][] telephone = {
    {'1', '2', '3'},
    {'4','5','6'},
    {'7', '8', '9'},
    {'#', '0', '.'}};

    for(char[] row : telephone){
        for(char number : row){
            System.out.print(number);
        }
        System.out.println();
    }
     
     System.err.println("----- game designer interview -----");
    String[] questions = {
                            "what we meant by game design ? ",
                            "what the game designer do ? ",
                           };
    
    String[][] options = {
        {"1- the game designer is the one who desicide what a game should be ",
         "2 - Game design means planning how a game works before you start programming it"
        },
        {"1 - the game designer is the one who desicide what a game should be ",
         "2 - hes the one who programe the game "
        }
    };

    int[] Answer = {2, 1};
    int score = 0;
    boolean isPassed = false;
    int userAnswer;
     Scanner scanner = new Scanner(System.in);

    for(int i = 0 ; i<questions.length; i++){
        System.out.println(questions[i]);
        for(String option : options[i]){
             System.out.println(option);
            
            
          
        }

         System.out.println(" Enter our answer : ");
             userAnswer = scanner.nextInt();
             if(userAnswer == Answer[i]){
                score += 10;
                if(score==20){
                    isPassed = true;
                    System.out.println("congratulation you passed the interview ");
                }
             } else{
                isPassed = false;
                System.out.println("wrong answer");
             };
        System.out.println();
    }

    scanner.close();

    }

}
