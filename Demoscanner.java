import java.util.Scanner;

public class Demoscanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("You entered: " + s);
        sc.close();
    }
}
