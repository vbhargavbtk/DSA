import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 1, b = 2, c;
        System.out.println("Enter a number ");
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            System.out.println(a);
            System.out.println(b);
            for(int i = 3 ;i <= n ; i++){
                c = a + b;
                System.out.println(c);
                
                a = b;
                b = c ;
                
                
                
            }
        }
    }
}
