import java.util.Scanner;

public class search_in_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String str = input.nextLine();
        char target = input.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                System.out.println("Element found at index " + i );
            }
        }
        input.close();

    }
}
