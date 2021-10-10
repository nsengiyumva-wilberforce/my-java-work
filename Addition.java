//Program that adds 2 integers by inputing them from the keyboard
import java.util.Scanner;//Program uses class Scanner

public class Addition{
    public static void main(String[] args){
        //Create a scanner to obtain input from the command
        Scanner input = new Scanner(System.in);

        int number1;//first number to add
        int number2;//second number to add
        int sum;//The sum of number1 and number2

        System.out.print("Enter the first integer: "); //prompt
        number1 = input.nextInt();//read the first number from the user

        System.out.print("Enter the second integer: "); //prompt
        number2 = input.nextInt();//read the second number from the user

        sum = number1 +number2;//Add the numbers and then store in sum

        System.out.printf("Sum is %d%n", sum);//display sum
        
    }//end the main methos
}//end class Adition