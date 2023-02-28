import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random(); // import of random number generator
        Scanner in = new Scanner(System.in); //import of java scanner
        boolean crapsRoll;//declare variable
        int point = 0;//declare variable
        String ContinueGame = ""; //declare variable
        boolean endGame = false;//declare variable
        do // beginning of initial program as is required for the Do you want to play again prompt
        {

            do // this loop will run as long as the
            {
                crapsRoll = false; //sets crapsRoll as false so the program doesn't store a value from previous looping session
                int die1 = rnd.nextInt(6) + 1; //random number generator for die1
                int die2 = rnd.nextInt(6) + 1; //random number generator for die2
                int sum = die1 + die2; //sum of the first roll


                System.out.println("You rolled a " + die1 + " and " + die2 + " on your first roll"); // lets the user know what they rolled
                System.out.println("The sum is " + sum); //lets the user know the sum of the first roll
                if (sum == 7 || sum == 11) //if statement that will run the code block if the condition is met
                {
                    System.out.println("The sum of your roll is " + sum + " You rolled a natural and won!"); // output that lets the user know that they won
                    crapsRoll = true; // boolean that will break out of the loop
                }
                else if (sum == 2 || sum == 3 || sum == 12) // else if statement that will run the code block below if the conditions are met
                {
                    System.out.println("The sum of your roll is " + sum + " You crapped out!");  //out put that lets the user know that they lost
                    crapsRoll = true; //boolean that will break out of the loop
                }
                else // else statement that stores the point value if none of the above conditions are met
                {
                    point = sum; // sets the point equal to the sum
                    System.out.println("The sum of your roll is " + point + " and now has been assigned as the point. Trying for point!"); // lets the user know that they are trying for the point value on the second roll
                    do // loop that will run until the while condition is met
                    {
                        die1 = rnd.nextInt(6) + 1; // random number generator for die 1
                        die2 = rnd.nextInt(6) + 1; // random number generator for die 2
                        sum = die1 + die2; // sum for second roll of die 1 and die 2
                        System.out.println("You rolled a " + die1 + " and " + die2 + " on your second roll"); // lets the user know what they rolled on the second roll
                        System.out.println("The second roll sum is " + sum);// displays the sum of the two die that were rolled
                        if (sum == point) // if statement that will run if the conditions are met
                        {
                            System.out.println("You win! "); // lets the user know that they won
                            crapsRoll = true; // boolean that will break out of the loop
                        }
                        else if (sum == 7) //
                        {
                            System.out.println("You lose");  // lets the user know they lost
                            crapsRoll = true; // boolean that will break out of the loop if the if condition is met
                            sum = point; // sets sum equal to point so the loop will break
                        }

                    }
                    while(sum != point); // lets us know what is expected in order to break loop
                }

            }
            while(!crapsRoll); // lets us know what is expected in order to break loop


            System.out.println("Do you want to play again? Y/N"); // asks user if they want to play again
            ContinueGame = in.nextLine(); // sets ContinueGame to input received from the user
            if (ContinueGame.equalsIgnoreCase("N")) // if statement that will run the code block below if the condition is met
            {
                endGame = true; // boolean that will break out of the loop
            }
        }while(!endGame); // if endgame is  set to true then the loop will end
    }
}
