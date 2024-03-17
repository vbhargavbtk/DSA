package sortingAlogorithms;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        System.out.println(Arrays.toString(sort(arr)));
        
    }
    static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                arr[j]=min()
            }

        }
    }
    
   
}
