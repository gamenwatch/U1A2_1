/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u1a2_variablevalues;
import java.util.Scanner;
/**
 *Jacob Lacey
 * Oct 1 2018
 * Practice the scanner utility
 */
public class U1A2_VariableValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**sets up an abstract variable (same as a string)
         * Wont run the console program completely until the condition is met
         * Curser will be on the console
         */
        Scanner keyedInput = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter the first number");
        num1 = keyedInput.nextInt();
        System.out.println("Enter the second number");
        num2 = keyedInput.nextInt();
        sum = num1 + num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum+"!");
        
        //funny joke
        if (sum == 4){
            System.out.println("minus one that's three quick maths!");
        }
        
        else{ }
        keyedInput.close();
    }
    
}
