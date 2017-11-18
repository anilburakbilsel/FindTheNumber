import java.util.Scanner;

public class PrimitiveNumberDecisionGame {
    public static void main(String [] args){
        int randomNumber = (int) (Math.random() *100 + 1);
        boolean won = false;
        System.out.println("We have guessed a random number between 0 to 100. Try to find it!");
        Scanner scanner = new Scanner(System.in);
        for(int i= 10; i>0; i--){
            System.out.println("You have "+ i + " chances to find it!");
            int guess = scanner.nextInt();
            System.out.println("Your guess was " + guess);
            if(randomNumber < guess){
                System.out.println("its a smaller number than " + guess);
            }
            else if(randomNumber > guess){
                System.out.println("its a bigger number than " + guess);
            }
            else{
                won = true;
                break;
            }
        }
        if(won){
            System.out.println("you guessed the correct number");
        }
        else{
            System.out.println("Sorry, you lost the game");
            System.out.println("the number was " + randomNumber);
        }
    }
}
