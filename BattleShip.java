
/**
 * BoardArray program creates a 2-Dimensional Array that is 5 by 5.
 * It has a function to fill every element with "Empty",
 * a method to print the array, a method to change all the elements,
 * and a method to replace a specific element.
 *
 * @author (Kai.w)
 * @version (1.0)
 */

import java.util.Scanner;

public class BattleShip 
{
    static void clearScreen() {
        System.out.print('\u000C');
    }
    
    static String[][] buildBoard() {
       String[][] board = {{"0","0","0","0","0"}, {"0","0","0","0","0"}, {"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
       
       for (int i = 0; i < 5; i++) {  // Rows
           for (int j = 0; j < 5; j++) {  // Columns
               board[i][j] = "Empty";
           }
       }
        
       return board;
    }
    
    static void printBoard(String[][] board)  {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("     " + board[i][j] + "     ");
            }
            System.out.println();
        }
        
    }
    
    static String[][] changeBoardElement(String[][] board, int x, int y) {
        Scanner key = new Scanner(System.in);
        
        
        
        if (x== 3) 
        {
            if (y == 1)
            {
                System.out.println("Hit");
                board[x][y] = "Hit  ";
            }
            if (y == 2)
            {
                System.out.println("Hit");
                board[x][y] = "Hit  ";
            }
            if (y == 3)
            {
                System.out.println("Hit");
                board[x][y] = "Hit  ";
            }
            else 
            {
                System.out.println("Miss");
            }
        }
        else 
        {
            System.out.println("Miss");
        }
        
        return board;
    }
    
    public static void main(String[] args) {
        // Initialize Booleans to allow repetition of tasks.
        boolean playAgain = true;
        boolean fillAnElement = true;
        int x, y;
        
        // Initialize an array of length 5.
        int number = 5;
        String[][] myBoard = {{"0","0","0","0","0"}, {"0","0","0","0","0"}, {"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        
        // Create a variable for the user to choose a particular element.
        int elementNumber;
        
        int HitN = 0;
        
        // Initialize scanner.
        Scanner myScanner = new Scanner(System.in);
        
        // The tasks of the program that the user can repeat through the boolean playAgain.
        do {
            clearScreen();
            
            System.out.println("Welcome to the battle ship game");
            System.out.println("This is the board");
            
            myBoard = buildBoard();
            
            printBoard(myBoard);
            
   
            while (true) 
            {
            
            System.out.println("Now try to guess where the ship is at");
           
            
            System.out.println("Guess the x value");
            x = myScanner.nextInt();
            System.out.println("Guess the y value");
            y = myScanner.nextInt();
            
            changeBoardElement(myBoard, x, y);
            
            printBoard(myBoard);
            
            if (HitN== 0)
            {
            System.out.println("You shinked the ship");
            System.out.print("Do you want to play again? Type true or false:  ");
            playAgain = myScanner.nextBoolean();
            }
                
            
            
        }
        
        
                
        } while (playAgain); 
    }
}
