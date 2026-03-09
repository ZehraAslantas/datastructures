package LinkStack2;

public class Link {
    public char data;
    public Link next;
    public Link(char data){
        this.data=data;
        this.next=null;
    }
    public void displayLink(){
        System.out.println("{ "+this.data+" }");

    }
}
