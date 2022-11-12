public class PrimeNumber {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int n=10;

        // for single number
        if(isPrime(n)){
            System.out.println("It is a Prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }

        // for multiple numbersss

        for(int i=1;i<=100;i++){
             if(isPrime(i)){
                 System.out.println(i+"It is a prime number");
             }
        }
    
    }
}
