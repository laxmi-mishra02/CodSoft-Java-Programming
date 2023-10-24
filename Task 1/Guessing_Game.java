import java.util.*;

class Guessing_Game
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int generated_Number=random.nextInt(100);
        int attempts;
        int guess;
        int score=0;

        boolean playAgain=true;
        System.out.println("Welcome to the Guessing Game!");

        while(playAgain)
        {
           System.out.print("Enter number of attempts: ");
           int n=sc.nextInt();
           for(attempts=n;attempts>0;attempts--)
           {
              System.out.print("Guess a number between 1 and 100: ");
              guess =sc.nextInt();
              if (guess==generated_Number)
              {
                System.out.println("Guess is correct.");
                System.out.println("Congratulations! You won.");
                score++;
                break;
               }
               else if(guess<generated_Number)
               {
                  System.out.println("This guess is too low.Try again! \nyou have " + (attempts-1) + " attempts left ");
               }
               else {
                    System.out.println("This guess is too high. Try Again! \nyou have " + (attempts-1) + " attempts left");
               }
            }
            if(attempts==0) {
              System.out.println("You ran out of attempts.\nYou lose");
            } 
        
            System.out.println("The number was: " +generated_Number);
            System.out.println("Game over !\nFinal score is: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String option=sc.next();
            sc.nextLine();
            if(!option.equalsIgnoreCase("yes")){
                playAgain=false;
            }
        }  
        sc.close();
    }
}