//ILYAS MOHAMMED ABDUL
// STUDENT_ID: 202102362
import java.util.Scanner;
public class Androidprogram {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to  Calculator Program");
        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.print("\nWhat would you like to do?: ");
        int choice = kb.nextInt();
        System.out.println();


        if (choice == 1){
            addition();
        }
        else if (choice == 2){
            subtraction();
        }
        else if (choice == 3){
            division();
        }
        else if (choice == 4){
            multiplication();
        }

        System.out.println();
        kb.close();
    }
    public static void addition(){

        int num1, num2;
        Scanner kb = new Scanner(System.in);

        System.out.println("Addition");

        System.out.print("\nFirst Number: ");
        num1 = kb.nextInt();

        System.out.print("\nSecond Number: ");
        num2 = kb.nextInt();

        kb.close();
        System.out.println("\nResult: " + num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtraction(){
        int num1, num2;
        Scanner kb = new Scanner(System.in);

        System.out.println("Subtraction");

        System.out.print("\nFirst Number: ");
        num1 = kb.nextInt();

        System.out.print("\nSecond Number: ");
        num2 = kb.nextInt();

        kb.close();
        System.out.println("\nResult: " + num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void division(){
        int num1, num2;
        Scanner kb = new Scanner(System.in);

        System.out.println("Division");

        System.out.print("\nFirst Number: ");
        num1 = kb.nextInt();

        System.out.print("\nSecond Number: ");
        num2 = kb.nextInt();

        kb.close();
        System.out.println("\nResult: " + num1 + " / " + num2 + " = " + (num1 / num2));
    }

    public static void multiplication(){
        int num1, num2;
        Scanner kb = new Scanner(System.in);

        System.out.println("Multiplication");

        System.out.print("\nFirst Number: ");
        num1 = kb.nextInt();

        System.out.print("\nSecond Number: ");
        num2 = kb.nextInt();

        kb.close();
        System.out.println("\nResult: " + num1 + " x " + num2 + " = " + (num1 * num2));
    
    }
}