package Double;

class Node{
    Node prev;
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

class LL{
    public Node head;
    public Node tail;
    private int size = 0 ;
    public void insertFirst(int data){
        Node node = new Node(data);
        if(size == 0){
            head = node ;
            tail = node ;
            size +=1 ;
            return;

        }
        node.next = head;
        head.prev = node;
        head = node ;
        size +=1 ;

    }
    public void insertEnd(int data){
        Node node = new Node(data);
        if(size == 0){
            insertFirst(data);
            return;
        }
        node.prev = tail;
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void display(){
        if(size == 0){
            System.out.println("List is Empty ");
            return;
        }
        Node temp = head ;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + "->");
            temp = temp.next ;
        } 
        System.out.print("null");
       
    }
    public int size(){
        return this.size;
    }

    public void insertAtIndex(int data,int index){
        
        Node node = new Node(data);
        Node temp = head ;
        for(int i = 1 ;i < index ; i++){
            temp = temp.next;
        }

        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        node.next.prev = node;

        size += 1;

    }
}