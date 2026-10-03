import java.util.Scanner;

public class JB17Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x;
        System.out.print("Enter a number: ");
        x = sc.nextInt();
        System.out.println("You entered: " + x);

        sc.close();
    }
    
}
