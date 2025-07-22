import java.util.Scanner;

public class string_array {
    public static void main(String[] args) {
        String[] array = new String[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            
            array[i] = input.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        input.close();
    }

}
