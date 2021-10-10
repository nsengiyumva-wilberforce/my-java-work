//This is the revision of what I read recently
import java.util.Scanner;
public class Revise{
    public static void main(String[] args){
        System.out.println("******************************************");
        System.out.println("MY FIRST JAVA APPLICATION");
        System.out.println("*******************************************");

        Scanner output = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = output.nextLine();

        System.out.print("Enter your Last name: ");
        String lastName = output.nextLine();

         System.out.print("Enter your age: ");
         int age = output.nextInt();

         System.out.print("Enter your Village: ");
         String village = output.nextLine();

         System.out.print("Enter your Parish: ");
         String parish = output.nextLine();

         System.out.print("Enter your sub-county: ");
         String subcounty = output.nextLine();

         System.out.print("Enter your County: ");
         String county = output.nextLine();

         System.out.print("Enter your district of origin: ");
         String district = output.nextLine();

         System.out.print("Enter your country: ");
         String country = output.nextLine();

         System.out.print("Enter your telephone number: ");
         int phoneNumber = output.nextInt();

         System.out.println("******************************************");
        System.out.println("BIO-DATA INFORMATION");
        System.out.println("*******************************************");

        System.out.println("+----------------------------------------------+");
        System.out.printf("+name: %s", firstName);

    }
}