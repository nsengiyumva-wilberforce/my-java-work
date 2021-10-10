//creating and manipulating ana account object
import java.util.Scanner;

public class AccountTest{
    public static void main(String[] args){
        //create a scanner object to obtain input from the window
        Scanner input = new Scanner(System.in);

        //Create an account object and assign it to myAccount
        Account myAccount = new Account();

        //Display initial value of name
        System.out.printf("The initial name is: %s%n%n", myAccount.getName());

        //prompt for and read name
        System.out.println("Please enter the name: ");
        String theName = input.nextLine();//read line of text
        myAccount.setName(theName);//put the name in myAccount
        System.out.println();//Outputs a blank line

        //display the name stored in object account
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
    }
}