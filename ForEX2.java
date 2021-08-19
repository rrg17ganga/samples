package samples;
import java.util.Scanner; 
class ForEx2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
 /* need to change and correct the loop once again */
        for (int i = 1; i <=rows ; i++) {
        	 
            for (int j =1 ; j <= i; j++) {
               System.out.print("7");
            }
 
           for (int j = rows; j >=i; j--) {
                System.out.print(" "); 
            }
      
            System.out.println();
        }
 
 
}
}