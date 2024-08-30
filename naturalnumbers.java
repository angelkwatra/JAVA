import java.util.*;
class naturalnumbers{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<=n ; i++){
            sum += i;
        }
        System.out.println(sum);

    }
}