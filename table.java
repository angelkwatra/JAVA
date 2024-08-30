import java.util.*;
class table{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int mul = 0;
        for(int i = 1; i<=10 ; i++){
            mul += n;
            System.out.println(mul);
        }
        

    }
}