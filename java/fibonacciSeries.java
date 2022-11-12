public class fibonacciSeries{
    private static void fibonacci(int n) {
        int num1=0;
        int num2=1;
        int counter=0;
        while(counter<n){
            int num3=num1 +num2;
            System.out.println(num1+"" );
            num1=num2;
            num2=num3;
            counter++;
        }
    }
    public static void main(String[] args) {
        int n=10;

        fibonacci(n);
        
    }


}