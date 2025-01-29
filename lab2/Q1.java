class Q1{
    public static void main(String agrs[]){
       
         for (int i = 5; i >= 1; i--) {
            
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
          
            for (int j = 1; j <= i; j++) {
              //  System.out.print(i);
                System.out.print("*");
            }
           
            System.out.println();
         }

    }
}
// class Q1{
//     public static void main(String agrs[]){
       
//          for(int i=1;i<=4;i++){
//             for(int k=1;k<=4-i;k++){
//                 System.out.print(" ");
//             }
            
//             for(int j=1;j<=i;j++){
//                 System.out.print("1");
//             }
            
//             System.out.println(" ");
//          }
//     }
// }