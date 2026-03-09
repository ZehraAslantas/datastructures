package LinkStack2;

public class LinkStack {
    private LinkedList list;
    public LinkStack(){
        list=new LinkedList();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void push(char data){
        list.insertFirst(data);
    }
    public char pop(){
        return list.deleteFirst();
    }
    public char peek(){
        return list.displayHead();
    }
    public void clear(){
        list.clear();
    }

}
