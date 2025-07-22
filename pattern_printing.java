



public class pattern_printing {
    public static void main(String[] args) {
        int n=5;
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
    }

    private static void pattern9(int n) {
        
        for (int i = 0; i < n; i++) {
            int spacecount=n-i-1;
            for (int j = 0; j < spacecount; j++) {
                System.out.print(" ");
                // int starcount=n+i+1;   
                
            }
            
            
        }
    }

    private static void pattern8(int n) {
        int starcount=1;
        for (int i = 0; i < n; i++) {
            int spacecount=n-i-1;
            for (int j = 0; j < spacecount; j++) {
                System.out.print(" ");
                
                
            }
            
            for (int j = 0; j <starcount; j++) {
                System.out.print("*");
            }
            System.out.println();
            starcount=starcount+2;
        }}
            
    private static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            int spacecount=i;
            for (int j = 0; j < spacecount; j++) {
                System.out.print(" ");
                
                
            }
            for (int j = 0; j < n-spacecount; j++) {
                System.out.print("*");
            }
            System.out.println();
            
    }
    }
    private static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            int spacecount=n-i-1;
            for (int j = 0; j < spacecount; j++) {
                System.out.print(" ");
                
                
            }
            for (int j = 0; j < n-spacecount; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }

    private static void pattern5(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
            if(i > n){
                for (int j = n-1; j > i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for (int j = 1; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    private static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = n; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }

}
