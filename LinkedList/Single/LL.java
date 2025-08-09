package Single;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

public class LL{
    public Node head;
    public Node tail;
    public int size = 0;

    public void insertFirst(int data){
        Node node = new Node(data);
        if(size == 0){          
            head = node;
            tail = node;
            
            
        }
        else{
            node.next = head ;
            head = node;
        }
        
        size += 1;
        return;

    }

    public void insertLast(int data){
        if(size == 0){
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node ;
        tail = node;
        size +=1 ;
        return;
    }

    public void insertAtIndex(int data,int index){
       
        Node node = new Node(data);


        Node temp = head;

        if(index == 0){
            insertFirst(data);
            return;
        }
        if(index == size){
            insertLast(data);
            return;
        }
        for(int i = 1; i < index ; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size += 1;

    }

    public void display(){
        if(size == 0){
            System.out.println("List is empty");
            return;
        }
        Node temp = head ;
        for(int i =1 ; i <= size ; i++){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){

        if(size == 0){
            System.out.println("Lsit is empty");
           
        }
        int val = head.data;
        
        head = head.next;


        System.out.println(val + " deleted");
        size -= 1;
    }

    public void deleteLast(){
        if (size <= 1) {
            deleteFirst(); 
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        int val = tail.data;
        System.out.println(val + " deleted");
        temp.next = null;
        tail = temp;
        size -= 1;

    } 
    

}