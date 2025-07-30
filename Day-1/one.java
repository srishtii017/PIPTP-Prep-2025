import java.util.*;
public class one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w=40;
        int x=4;
        //int y=0;
        fun(w,x);
    }
    static void fun(int w , int x){
        int y=0;
        if(x%w==0 || w%x==0){
            y=y+1;
        }
        else{
            y=y+10;
        }
        System.out.println(y);



    }
}
