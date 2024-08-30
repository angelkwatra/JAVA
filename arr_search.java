import java.util.*;
public class arr_search{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns ");
        int cols = sc.nextInt();
        int[][] table = new int[rows][cols];
        for(int i = 0; i<rows ; i++){
            for (int j = 0;j< cols;j++){
                System.out.println("Enter the element for index " + i + " , "+ j);
                table[i][j] = sc.nextInt();
                
            }
        }
        int x = 1;
        boolean b = false;
         for(int i = 0; i<rows ; i++){
            for (int j = 0;j< cols;j++){
                if(table[i][j]==x){
                    b = true;
                    System.out.print("element found at index "+ i +" "+ j);
                }
                
                
                
                 
                
            }
            
        
            
        }
        if(b == false){
            System.out.println("not found");
        }


    }
}