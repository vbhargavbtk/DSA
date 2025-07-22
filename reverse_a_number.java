import java.util.Scanner;

public class reverse_a_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;
        
        while(n > 0){
            int rem = n % 10 ;
            n = n / 10 ;
            result = result * 10 + rem ;
            
            

        }
        System.out.println("Result = " + result);
        input.close();
    }
    
}
