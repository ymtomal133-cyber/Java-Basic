import java.util.Scanner;
public class addsubmuldivFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + sub(a, b));
        System.out.println("Multiplication: " + mul(a, b));
        System.out.println("Division: " + div(a, b));
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }

    static int mul(int x, int y) {
        return x * y;
    }

    static double div(int x, int y) {
        return (double) x / y;
    }
}
