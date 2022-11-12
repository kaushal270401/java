public class palindromeNumber {
    // for numbers this method
    public static boolean isPalindrome(int n){
        int r,sum=0;
        int temp=n;
        while(n>0){
             r=n%10;
             sum=(sum*10)+r;
             n=n/10;
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }
    }
    // for Strings this method
    public static boolean isPalindrome(String n){
        String rev="";
        for(int i=n.length()-1 ;i>=0;i--){
            rev=rev + n.charAt(i);
        }
        if(rev.equals(n))
        {
            return true;
        }
        else{
            return false;
        }
    }



    public static void main(String[] args) {
    //   int number=1011;
        String word="abbac";
      if(isPalindrome(word)){
        System.out.println("It is a palindrome number");
      }
      else{
        System.out.println("Not a palindrome number");
      }
    }
}
