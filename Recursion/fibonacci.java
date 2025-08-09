package Recursion;
//To print Fibonacci numbers upto certain target
public class fibonacci {
    public static void main(String[] args) {
        // int a = 0;
        // int b = 1;
        // int target = 100 ;
        // int count = 9;
        // System.out.println("0");
        // //fib(a,b,target);
        // int i = 1;
        // //fib2(a,b,count,i+1);
        // int ans = fib3(a, b, count - 2, i );
        // System.out.println(ans);
        int ans2 = fib4(5);
        System.out.println(ans2);
    }
    //To print Fibonacci numbers upto certain target
    public static void fib(int a , int b,int target){
        int c = a + b;
        if(c > target){
            return;
        }
        else{
            System.out.println(c);
            fib(b,c,target);
        }
    }
    //To print certain number of Fibonacci numbers upto to n
    public static void fib2(int a , int b,int count,int i){
        
        int c = a + b;
        if(i > count){
            return;
        }
        else{
            System.out.println(c);
            fib2(b,c,count,i+1);
        }
    }

    //To find particular nth Fibonacci number
    public static int fib3(int a , int b,int count,int i){
        
        int c = a + b;
        if(i > count){
            return c;
        }
        return (fib3(b,c,count,i+1));
        
    }

    //The above all methods works as bottom-up approach 
    //Now we will see top-down approach as a tree

    public static int fib4(int target){
        if(target < 2){
            return target;
        }
        return fib4(target - 2) + fib4( target - 1) ;
    }



}
