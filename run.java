
import java.util.*;
class run{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of n either 0 or 1");
        int n = sc.nextInt();
        switch(n){

        case 1:
            do{
                System.out.println("Enter marks");
                int marks = sc.nextInt();
                if (marks >=90){
                    System.out.println("This is good");
                }
                else if (marks>=60){
                    System.out.println("This is also good");
                
                }
                else{
                    System.out.println("This is good as well");
                } 
            }while(n==1);
            break;
        case 0:
            break;
        default:
            System.out.println("Enter valid entry");

        }
        
    }
}