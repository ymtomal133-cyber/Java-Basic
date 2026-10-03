public class OddEvenFunction {
    public static void main(String[] args) {
        evenOdd(5);
    }

    static void evenOdd(int x) {
        if(x % 2 == 0){
            System.out.println(x + " is an even number.");
        }else{
            System.out.println(x + " is an odd number.");
        }
    }
}
