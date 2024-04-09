/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicaloperators;

//Logical operators
//AND >> &&
//OR >> ||
//NOT >> !

public class LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declare 3 variables to be used with the logical operators
        int x = 5; //will be used with the AND/OR statement
        int y = 10; //will be used with the AND/OR statement
        boolean flag = true; //will be used with the NOT statement
        
        //If statement: Single selection
        if (x > 0 && y > 0) {
            System.out.println("AND operators: both x & y are greater than zero");
        }
        
        //If statement with OR Operator: Single selection
        if (x < 0 || y > 0) {
            System.out.println("OR operator: Either x is positive or y is negative");
        }
        
        //NOT Operator
        if (!flag) { // If (NOT TRUE) >>> false 
            System.out.println("NOT Operator: Flag variable will be read as false"); //yes path
        } else {
            System.out.println("NOT Operator: Flag variable will be read as true"); // no path
        }
        
        /*Precedance of the logical operators from highest to lowest:
            ! (NOT)
            && (AND)
            || (OR)
        */
    }
    
}
