public class JB18Function {
    public static void main(String[] args) {
        System.out.println("Program starts");
        sayHi();

        int addition = getSum(100,50);
        System.out.println("Result: " + addition);
    }

    static int getSum(int x, int y){
            int sum = x + y;
            
            return sum;
        }

        static void sayHi(){
            System.out.println("Hi");
        }
    
}
