public class third {
    public static int fun(int a , int b){
        if(a && b && a+b>0){
            return a+fun(a-2,b-2)+b;
        }
        return a^b;

    }
    public static void main(String[] args) {
        int a=8;
        int b=8;
        int ans=fun(a,b);
        System.out.println(ans);
    }
}
// in java it is showing error , bu tin python it is showing 40
