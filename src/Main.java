import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        boolean crapsRoll = false;
        int point = 0;

        String ContinueGame = "";
        boolean endGame = false;
        do
        {

            do
            {
                int die1 = rnd.nextInt(6) + 1;
                int die2 = rnd.nextInt(6) + 1;
                int sum = die1 + die2;


                System.out.println("You rolled a " + die1 + " and " + die2 + " on your first roll");
                System.out.println("The sum is " + sum);
                if (sum == 7 || sum == 11)
                {
                    System.out.println("The sum of your roll is " + sum + " You win!");
                    crapsRoll = true;
                }
                else if (sum == 2 || sum == 3 || sum == 12)
                {
                    System.out.println("The sum of your roll is " + sum + " You lose!");
                    crapsRoll = true;
                }
                else
                {
                    point = sum;
                    System.out.println("The sum of your roll is " + point + " and now has been assigned as the point");
                    do
                    {
                        die1 = rnd.nextInt(6) + 1;
                        die2 = rnd.nextInt(6) + 1;
                        sum = die1 + die2;
                        System.out.println("You rolled a " + die1 + " and " + die2 + " on your second roll");
                        System.out.println("The second roll sum is " + sum);
                        if (sum == point)
                        {
                            System.out.println("You win! ");
                            crapsRoll = true;
                        }
                        else if (sum == 7)
                        {
                            System.out.println("You lose");
                            crapsRoll = true;
                            sum = point;
                        }

                    }
                    while(sum != point);
                }

            }
            while (!crapsRoll);


            System.out.println("Do you want to play again? Y/N");
            ContinueGame = in.nextLine();
            if (ContinueGame.equalsIgnoreCase("N"))
            {
                endGame = true;
            }
        }while(!endGame);
    }
}
