import java.util.*;

public class arr_names{

    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int size = sc.nextInt();
        String names[] = new String[size];

        for (int i = 0; i < size ; i++) {
            names[i]= sc.next();

            
        }
        for (int i = 0; i < size ; i++) {
           System.out.println(names[i]); 
            
            
        }

        
    }
}