package sortingAlogorithms;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
       int[] arr={2,1,4,5,3};
       System.out.println(Arrays.toString(cyclic_sort(arr)));
      
     
    }
    static int[] cyclic_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            while(i!=arr[i]-1){
                swap(arr,i,arr[i]-1 );
            }
        }
        return arr;
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
