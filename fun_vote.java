import java.util.*;
class fun_vote{
    public static void can_vote(int age){
         if(age>=18){
            System.out.println("eligible");
        }else{
            System.out.println("Not eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age= sc.nextInt(); 
        can_vote(age);
    }
}