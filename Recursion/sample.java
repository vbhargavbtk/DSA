package Recursion;

import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        //print(n);
        //print2(1,n);
        //print3(n);
        int ans = print8(num,(int)(Math.log10(num)) + 1);
        System.out.println(ans);
        

        input.close();
        
    }

    public static void print(int num){
        if( num == 0){
            return;
        }
        else{
            System.out.println(num);
            print(num - 1);
        }
    }

    public static void print2(int i,int num){
        
        if(i == num + 1){
            return ;
        }
        else{
            System.out.println(i);
            
            print2(i+1,num);
        }
    }
    public static void print3(int num){
        if( num == 0){
            return;
        }
        else{
            
            print3(num - 1);
            System.out.println(num);
        }
    }
    //Function to multiply numbers from 1 to n(Factorial of a number)
    public static int print4(int num){
        
        if( num == 1){
            return num;
        }
        
        return num * print4(num - 1);
        
        
    }
    //Function to add numbers from 1 to n
    public static int print5(int num){
        
        if( num == 1){
            return num;
        }
        
        return num + print5(num - 1);
        
        
    }

    //Function to add the digits of a number
    public static int print6(int num){
        
        if(num == 0){
            return 0;
        }
        return num % 10 + print6(num/10);
        
        
    }
    //Function to multiply the digits of a number
    public static int print7(int num){
        
        if(num == 0){
            return 1;
        }
        return num % 10 * print7(num/10);
        
        
    }

    //Function to reverse a number
    public static int print8(int num,int digits_count){
        if(num % 10 == num){
            return num;
        }
        int rem = num % 10;
        
        return rem * (int) (Math.pow(10,digits_count - 1))  + print8(num/10,digits_count - 1);
    }
    
}
