package LinkedList;

public class LinkListApp {
    static void main() {
        LinkList list=new LinkList();
        list.displayLinkList();

        list.insertToHead(1,1.0);
        list.insertToHead(4,4.0);

        list.displayLinkList();
        list.insertToLast(7,7.7);
        list.displayLinkList();
        list.delete(1.0);
        list.displayLinkList();

    }
}