public class JB142DArray {
    public static void main(String[] args) {
        int x[][] = {{10,11,12}, {20,21,22}};
        x[1][1] = 10;
        x[1][0] = 20;

        int y = x[1][0] + x[1][1];
        System.out.println(y);
    }
}
