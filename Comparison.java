//A comparison java app

import java.util.Scanner;

public class Comparison{
    public static void main(String[] args){
        //Creates scanner to obtain input from the commnadline
        Scanner input = new Scanner(System.in);

        int number1;//First number to compare
        int number2;//Second number to compare

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 == number2)
        System.out.printf("%d == %d%n", number1, number2);

        if (number1 != number2)
        System.out.printf("%d != %d%n", number1, number2);

        if (number1 < number2)
        System.out.printf("%d < %d%n", number1, number2);

        if (number1 > number2)
        System.out.printf("%d > %d%n", number1, number2);

        if (number1 <= number2)
        System.out.printf("%d <= %d%n", number1, number2);

        if (number1 >= number2)
        System.out.printf("%d >= %d%n", number1, number2);


    }
}