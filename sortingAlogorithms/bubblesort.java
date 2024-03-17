package sortingAlogorithms;

import java.util.Arrays;
import java.util.Scanner;

class bubblesort{
     @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        System.out.println("enetr the number of elements you want to sort");
        
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("enetr the elements");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }



        System.out.println(Arrays.toString(sort(arr)));
        
     }
     static int[] sort(int[] array){
        for (int i = 0; i <= array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    
                }
            }
        }
        return array;
     }
}