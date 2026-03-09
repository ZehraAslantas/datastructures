package LinkStack2;

public class LinkedList {
    private Link head;

    public LinkedList() {
        this.head = null;
    }
    public boolean isEmpty(){
        return this.head==null;
    }
    public void insertFirst(char data){//push
        Link newLink= new Link(data);
        newLink.next=this.head;
        this.head=newLink;
    }
    public char deleteFirst(){//pop
        if (this.isEmpty()){
            return '\0';
        }
        char temp=this.head.data;
        this.head=this.head.next;
        return temp;
    }
    public char displayHead(){
        if (this.isEmpty()){
            return '\0';
        }
        return this.head.data;
    }
    public void clear(){
        this.head=null;
    }
}
