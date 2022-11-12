


public class starPattern{
    // for upper part of diamond

    public static void patternOne(int n){
        for(int i=1;i<n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for (int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    // for lower part of diamond
    public static void patternTwo(int n){
        for(int i=n;i>0;i--){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int n=5;
        patternOne(n);
        patternTwo(n);

    }
}