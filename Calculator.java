import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers please ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        input.nextLine();
        System.out.print("Would you like to add or subtract these numbers? ");
        
        String operation = input.nextLine().toLowerCase();

        if (operation.equals("add")) {
            int sum = num1 +num2;
            System.out.println("You chose to add " +num1 + " and " + num2 + " is: " + sum);
        }else if (operation.equals("subtract")){
            int difference = num1 - num2;
            System.out.println("You chose subtraction. The difference between " + num1 + " and " + num2 + " is: " + difference);
        } else {
            System.out.println(" Invalid choice. Please type 'add' or 'subtract'.");
        }
        input.close();
        
        
    }
}