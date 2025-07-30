public class fifth {
    public static void main(String[] args) {
        int c;
        int a=3;
        int b=5;
        for(c=2;c<4;c++){
            if(a%2 < b%3){
                a=4%3;
            }
            else{
                if(5%3>b){
                    a=b;
                }
                b=1;
            }
            
        }
        System.out.print(a+b);
    }
    
}
