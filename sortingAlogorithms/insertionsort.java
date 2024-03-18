package sortingAlogorithms;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] array={5,3,4,1,2};
        System.out.println(Arrays.toString(insertion_sort(array)));
    }
    static int[] insertion_sort(int[] arr){
         for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
                
            }
            
         }
        return arr;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
