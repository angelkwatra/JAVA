import java.util.*;

class funavg{
    public static void avg(int a,int b,int c){
        int average= (a+b+c)/3;
        System.out.println("The average of "+ a +" "+ b +" "+" and "+ c +" is: ");
        System.out.println(average);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First integer");
        int a= sc.nextInt();
        System.out.println("Enter Second integer");
        int b= sc.nextInt();
        System.out.println("Enter Third integer");
        int c= sc.nextInt();
        avg(a,b,c);

        
    }
}