package Arrays;

import java.util.Random;
import java.util.Scanner;

public class GameOne {
    public static void main(String[] args) {
        //Store choices in an array
        //get userChoice
        //get computerChoice - random
        //tally choices -
        //win, lose, tie
        //accessed using 0,1,2
        String[] game = {"rock","paper","scissors"};
        String userChoice;
        String computerChoice;
        boolean matchesGame = false;
        boolean playGame = true;
        int total = 0;
        int compTotal = 0;


        //have many turns
        do{
            Scanner scanner = new Scanner(System.in);

            System.out.print("rock, paper or scissors? ");
            userChoice = scanner.nextLine();

            for(int x = 0;x < game.length;x++){
                //if user choice resembles game choice
                if(userChoice.equals(game[x])){
                    matchesGame = true;
                }
            }
            //!matchesGame == false
            if(!matchesGame){
                System.out.println("choice is invalid!");
            }else{
                System.out.println("user chose: " +userChoice);
                Random random = new Random();
                int computerIndex = random.nextInt(0,3);
                computerChoice = game[computerIndex];
                System.out.println("computer chose: " + computerChoice);

                if(computerChoice.equals(userChoice)){
                    //tie
                    System.out.println("you have tied");
                    continue;
                }else if(computerChoice.equals("rock") && userChoice.equals("paper")){
                    //win
                    System.out.println("you have won");
                    total += 10;
                }else if(computerChoice.equals("paper") && userChoice.equals("scissors")){
                    //win
                    System.out.println("you have won");
                    total += 10;
                }else if(computerChoice.equals("scissors") && userChoice.equals("rock")){
                    //win
                    System.out.println("you have won");
                    total += 10;
                }else{
                    //lose
                    System.out.println("you have lost");
                    compTotal += 10;
                    continue;
                }

                if(total == 100 || compTotal == 100){
                    break;
                }
                System.out.print("play again, y/n");
                char play = scanner.next().toLowerCase().charAt(0);
                if(play == 'y' || play == 'n'){
                    if(play == 'n'){
                        //close game turn
                        playGame = false;
                    }
                }else{
                    System.out.println("invalid choice - playing again");
                }

            }
        }while(playGame);

        System.out.println("game over!!");
        System.out.println("user total: " + total);
        System.out.println("computer total: " + compTotal);

    }
}
