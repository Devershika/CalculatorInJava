import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);
    Operations op = new Operations();

    // Performs addition
    public void addition() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Result = " + op.add(a, b));
    }


