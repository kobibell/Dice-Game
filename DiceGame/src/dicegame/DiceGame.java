package dicegame;

import java.util.Random;
public class DiceGame 
{

    public static void main(String[] args) 
    {
        Random rand = new Random();
        
        // Intializing all variables that will be used in the code.
        int userCount = 0, compCount = 0, tieCount = 0, userSum, compSum;
        int userDie1, userDie2, compDie1, compDie2;
        
        // Beginning the for loop to have 17 rounds against the computer.
        for (int i = 1; i <= 17; i++)
        {
            // Header for the computer turn.
            System.out.print("Computer Turn Round #" + i + "\n");
            System.out.print("- - - - - - - - - - - - - - - -\n");
            
            // Intializing the random number generator for the computer.
            compDie1 = rand.nextInt(5) + 1;
            compDie2 = rand.nextInt(100) + 1;
            
            // Establishing the loaded die for the computer.
            if (compDie2 >= 68)
                compDie2 = 1;
            else if (compDie2 > 59)
                compDie2 = 2;
            else if (compDie2 > 50)
                compDie2 = 3;
            else if (compDie2 > 41)
                compDie2 = 4;
            else
                compDie2 = 5;
            
            // Adding the sum of the unbiased and loaded die from the computer.
            compSum = compDie1 + compDie2;
            
            // Prints out the random generated number of the normal and loaded die from the computer.
            System.out.printf("Normal Die: %4d\n", compDie1);
            System.out.printf("Loaded Die: %4d\n", compDie2);
            System.out.printf("       Sum: %4d\n", compSum);
            System.out.println("");
            
            // Header for the user turn.
            System.out.print("User Turn Round #" + i + "\n");
            System.out.print("- - - - - - - - - - - - - - - -\n");
            
            // Intializing the random number generator for the user.
            userDie1 = rand.nextInt(5) + 1;
            userDie2 = rand.nextInt(100) + 1;
            
            // Establishing the loaded die for the user.
            if (userDie2 >= 68)
                userDie2 = 1;
            else if (userDie2 > 59)
                userDie2 = 2;
            else if (userDie2 > 50)
                compDie2 = 3;
            else if (userDie2 > 41)
                userDie2 = 4;
            else
                userDie2 = 5;
            
            // Adding the sum of the unbiased and loaded die from the user.
            userSum = userDie1 + userDie2;
            
            // Prints out the random generated number of the normal and loaded die from the user.
            System.out.printf("Normal Die: %4d\n", userDie1);
            System.out.printf("Loaded Die: %3d\n", userDie2);
            System.out.printf("       Sum: %3d\n", userSum);
            System.out.println();
            
            // Establishing the winner of the user and computer.
            if (userSum > compSum)
            {   System.out.println("The user is the winner of round #" + i+ "\n");
                userCount++;
            }
            else if (compSum > userSum)
            {   System.out.println("The computer is the winner of round #" + i + "\n");
                compCount++;
            }
            else if (userSum == compSum)
            {   System.out.println("There is a tie between the user and computer!\n");
                tieCount++;
            }
  
        }
        
        // Prints out the total number of wins from the computer, user, and total number of ties.
        System.out.printf("Total Number of Comp Wins: %4d\n", compCount);
        System.out.printf("Total Number of User Wins: %4d\n", userCount);
        System.out.printf("Total Number of tie games: %4d\n", tieCount);
        System.out.println();
        
        // The following if statements are used to see who is the Grand Champion by comparing the counters.
        if (userCount > compCount)
            System.out.printf("The user is the Grand Champion!\n");
        else if (compCount > userCount)
            System.out.printf("The computer is the Grand Champion!\n");
        else
            System.out.printf("There's a tie!\n");

    } //end main
    
} //end class
