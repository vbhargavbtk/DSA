package sortingAlogorithms;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] array={1};
        System.out.println(Arrays.toString(Selectionsort(array)));
    }
    static int[] Selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1-i;
            swap(arr,last,max(arr,0,last));
        }
        return arr;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int max(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i <=end; i++) {
            if(arr[max]<arr[i]){
                max=i;;
            }
        }
        return max;
    }
}
