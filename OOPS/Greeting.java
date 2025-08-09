package OOPS;
import OOPS2.someClass;
import java.util.ArrayList;
import java.util.Arrays;

public class Greeting {
    public static void main(String[] args) {
        greet();
        Human h1 = new Human(10);
        h1.walk();
        Students s1 = new Students(10);
        s1.walks();
        
       ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2, 1, 4, 2, 3, 4, 2, 2, 2, 9));
       array.sort(null);
       for(int i =0 ;i < array.size() ;i++){
        System.out.println(array.get(i));
       }

       someClass s = new someClass(20);
       System.out.println(s.square_of_num());
    }
    public static void greet(){
        System.out.println("Hello World");
    }

    
}

class Human{
    int age ;
    public Human(int age){
        this.age = age;
    }
    public void walk(){
        System.out.println("Yes,I can walk");
    }
}

class Students extends Human{
   
    public Students(int age) {
        super(age);
    }
    public void student(){
        System.out.println("Yes , I am Student and Human");
    }
    public void walks(){
        super.walk();
    }
}