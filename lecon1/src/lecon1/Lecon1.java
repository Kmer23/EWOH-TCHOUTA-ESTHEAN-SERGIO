/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package lecon1;
import java.util.Scanner ;
 
import java.util.Scanner;

public class Lecon1 
{
    public static void main(String[] args) 
    {     
    // create a Scaner object to obtain input  from the command  window     
         Scanner input = new Scanner(System.in);
    
     account myAccount = new account();
     
 // display initial value of name(null)
  System.out.printf("Initial name is:%s%n%n", myAccount .getName());
  System.out.println("Please enter the name:");
  String theName = input.nextLine();
myAccount.setName(theName);
System.out.println();
System.out.printf("Name in object myAccount is:%n%s%n",
26 );
    }   
}    
       