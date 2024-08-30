import java.util.*;
class fun_circum{
    public static void cir(double r){
        double circumference = 3.14*2*r;
        System.out.println(circumference);

        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r =sc.nextInt();
        cir(r);
       

    }
}