public class MinAndMax {
    public static int Max(int a[]){
        int Max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>Max){
                Max=a[i];
            }
        }
        return Max;
    }


    public static int Min(int a[]){
        int min=10000;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;

    }



    public static void main(String[] args) {
        int numbers[]={10 ,20 ,23,15,32,3,45,3,2,4 };
        System.out.println(Max(numbers));
        System.out.println(Min(numbers));

    }
}
