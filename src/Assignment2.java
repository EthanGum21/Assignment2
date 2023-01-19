
/* Assignment #: 2
 Name: Ethan Chacko
 StudentID: 1224071290
 Lecture: MWF 12:20
 Description: Assignment #2 will be the construction of a program that performs 5 different arithmetic operations based on the user input. The four operations are:

1. Summation of integers from 1 to m
2. Factorial of a given number n (n!)
3. Count of odd integers in a given sequence
4. Display the leftmost digit of a given number n
5. Greatest common divisor of two given integers n and m

Your program should prompt the user with a menu including six options, ask the user for one option, and perform the corresponding computation. This process will repeat until the user chooses option 6 i.e., “Quit”.
 */
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice = -1;
        int userInput1;
        int sum = -1, fac = 1, leftmost = -1;
        int length;

        do {
            displayMenu();
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Enter a number:");
                    userInput1 = scanner.nextInt();
                    sum = userInput1 * (userInput1 + 1)  / 2;
                    System.out.println("The sum of 1 to " + userInput1 + " is " + sum);
                    System.out.println("");

                    break;
                case 2:
                    System.out.println("Enter a number:");
                    userInput1 = scanner.nextInt();
                    for(int i = 1;i <= userInput1;i++) {
                        fac = fac * i;
                    }
                    System.out.println(fac);
                    System.out.println("");


                    break;
                case 3:
                    System.out.println("Enter the length of sequence");
                    length = scanner.nextInt();
                    System.out.println("Enter the sequence");
                    int oddCount = 0;
                    //complete the code that calculates the count of odd integers and prints it
                    break;

                case 4:
                    System.out.println("Enter a number:");
                    userInput1 = scanner.nextInt();
                    //complete the code that displays the leftmost digit of a number and prints it
                    break;

                case 5:
                    System.out.println("Enter the first integer: ");
                    int x = scanner.nextInt();
                    System.out.println("Enter the second integer: ");
                    int y = scanner.nextInt();
                    // /complete the code that calculates the gcd of the two integers entered and prints it

                    break;
                case 6:
                    System.out.println("Bye");
                    break;
            }
        } while (userChoice != 6);

    }


    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1. Calculate the sum of integers from 1 to m");
        System.out.println("2. Calculate the factorial of a given number");
        System.out.println("3. Calculate the count of odd integers in a given sequence");
        System.out.println("4. Display the leftmost digit of a given number");
        System.out.println("5. Calculate the greatest common divisor of two given integers");
        System.out.println("6. Quit");
    }
}
