package homework5_2_cointoss;

/* 
 * Chapter No. 5    Excercise No. 2
 * File Name: HomeWork5_2_CoinToss.java
 * @author: Eric Schenck
 * Date: September 29, 2012
 * 
 * 
 * Problem Statement: Write a program that will print out statistics 
 * for eight coin tosses. The user will input either an “h” for heads or 
 * a “t” for tails for the eight tosses. The program will then print out 
 * the total number and percentages of heads and tails. Use the increment 
 * operator to increment the number of tosses as each toss is input.
 * 
 * 
 *
 * Overall plan:
 * 1.) Ask the user to flip a coin and enter the results of eight (8) tosses
 * 2.) use a multiway if/else statement to compare the users input and incriment8
 * the numberOfTailes or the numberOfHeads or print out that a mistake has 
 * occured..
 * 3.) Calculate the percentage of heads by taking the numberOfHeads and 
 * dividing it by the total amount of flips in this case eight, and then 
 * multiplying that number by 100 in order to convert from decimal to a percent.
 * 4.) Calculate the percentage of Tails by subracting the percentage of heads
 * found in plan#3 from a total of 100%.
 * 5.) Print out the results, i.e. how many heads, tails, and percentages of 
 * both heads and tails.
 *
 * 
 */

//import JOptionPane, cuz i like how it looks, and DecimalFormat to 
//later format my answeres
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class HomeWork5_2_CoinToss {
    
    
    //Beginning of main
    public static void main(String[] args) {
        
        //show a quick message, explaining to the user how to use the program
        JOptionPane.showMessageDialog(null, "Hello there!\nIf you will id"
            + " like you to flip a coin\nfor me a total of eight times.\n"
            + "Enter either 'h' for heads or 't' for tails.");
        
        
        //prompting user for input and setting each one to their own string
        String userInput1 = 
                JOptionPane.showInputDialog(null, "What is the result"
                + " of your first toss?\n\nPlease enter h or t\nno "
                + "capital letters(case sensitive):");
        String userInput2 =
                JOptionPane.showInputDialog(null, "What is the result "
                + "of your second toss?\n\nRemember to enter h or t:");
        String userInput3 =
                JOptionPane.showInputDialog(null, "Now enter the result"
                + " of your third toss:");
        String userInput4 =
                JOptionPane.showInputDialog(null, "Now enter the result of"
                + " of your fourth toss:");
        String userInput5 =
                JOptionPane.showInputDialog(null, "Keep it up your doing"
                + " a great job!\n\nNow enter the result of "
                + "your fifth toss:");
        String userInput6 =
                JOptionPane.showInputDialog(null, "Now enter the result of "
                + "your sixth toss:");
        String userInput7 =
                JOptionPane.showInputDialog(null, "Keep going your almost "
                + "finished!\n\nEnter the result of your seventh toss:");
        String userInput8 =
                JOptionPane.showInputDialog(null, "And finally,\nEnter "
                + "the result of your eighth toss:");
        
        
       /*
        * creating three doubles and setting there values, the numberOfHeads
        * and the numberOfTails will later be incrimented, and the numberOfFlips 
        * will be used to find the percentage of events occuring.
        */
       
        double numberOfHeads = 0;
        
        double numberOfTails = 0;
        
        double numberOfFlips = 8; 
        
        /*
         * using eight multiway if-else statements to evaluate the users input
         * and to incriment either numberOfHeads, or numberOfTails appropriately.
         * Also if the user inputs the wrong value, that is something other than
         * 'h' or 't', the program will output that an error was made and then
         * the program will abruptly terminate
         */
        if (userInput1.equals("h"))
        {
            ++numberOfHeads;
                        
        }
        else if (userInput1.equals("t"))
        {
            ++numberOfTails;
            
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "You entered incorrectly\n"
                    + "The program will now terminate\nGoodbye");
            System.exit(0);
        }
        
        if (userInput2.equals("h"))
        {
            ++numberOfHeads;
      
        }
        else if (userInput2.equals("t"))
        {
            ++numberOfTails;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "You entered incorrectly\n"
                    + "The program will now terminate\nGoodbye");
            System.exit(0);
        }
        
        if (userInput3.equals("h"))
        {
            ++numberOfHeads;
        }
        else if (userInput3.equals("t"))
        {
            ++numberOfTails;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "You entered incorrectly\n"
                    + "The program will now terminate\nGoodbye");
            System.exit(0);
        }
        
        if (userInput4.equals("h"))
        {
            ++numberOfHeads;
        }
        else if (userInput4.equals("t"))
        {
            ++numberOfTails;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "You entered incorrectly\n"
                    + "The program will now terminate\nGoodbye");
            System.exit(0);
        }
        
        if (userInput5.equals("h"))
        {
            ++numberOfHeads;
        }
        else if (userInput5.equals("t"))
        {
            ++numberOfTails;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "You entered incorrectly\n"
                    + "The program will now terminate\nGoodbye");
            System.exit(0);
        }
        
        if (userInput6.equals("h"))
        {
            ++numberOfHeads;
        }
        else if (userInput6.equals("t"))
        {
            ++numberOfTails;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "You entered incorrectly\n"
                    + "The program will now terminate\nGoodbye");
            System.exit(0);
        }
        
        if (userInput7.equals("h"))
        {
            ++numberOfHeads;
        }
        else if (userInput7.equals("t"))
        {
            ++numberOfTails;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "You entered incorrectly\n"
                    + "The program will now terminate\nGoodbye");
            System.exit(0);
        }
        
        if (userInput8.equals("h"))
        {
            ++numberOfHeads;
        }
        else if (userInput8.equals("t"))
        {
            ++numberOfTails;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "You entered incorrectly\n"
                    + "The program will now terminate\nGoodbye");
            System.exit(0);
        }
        
        //setting up DecimalFormat into two desired formats, df and df1
        DecimalFormat df1 = new DecimalFormat("##.0");
        DecimalFormat df = new DecimalFormat("##");
        
        
        //dividing the numberOfHeads by the numberOfFlips (8)
        double decimalPercentHeads = numberOfHeads / numberOfFlips;
        
        //taking the last answere and multiplying it by 100 to create a percent
        double finalPercentHeads = decimalPercentHeads * 100;
        
        //subracting the percent of heads by 100 to find the percent of tails
        double percentTails = 100 - finalPercentHeads;
    
        //printing out the number of heads, tails, and percentages for both
        JOptionPane.showMessageDialog(null, "Number of heads: "
                + df.format(numberOfHeads) + "\nNumber of tails: "
                + df.format(numberOfTails) + "\nPercent heads: " 
                + df1.format(finalPercentHeads) + "%"
                + "\nPercent tails: " + df1.format(percentTails) + "%"); 
                
                

    
    }//end of main
}//end of public class HomeWork5_2_CoinToss
