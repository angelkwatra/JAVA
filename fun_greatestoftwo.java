import java.util.*;
class fun_greatestoftwo{
    public static void grt(int a,int b){
        if(a>b){
            System.out.println(a+" is greater than "+ b);
        }
        else if(b>a){
            System.out.println(b +" is greater than "+ a);

        }
        else{
            System.out.println("both are equal");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        grt(a,b);

    }
}