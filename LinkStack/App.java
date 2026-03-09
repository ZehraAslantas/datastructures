package LinkStack2;

public class App {
    static void main(){
        LinkStack stack=new LinkStack();
        stack.push('U');
        stack.push('C');
        stack.push('S');
        while (!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }
        stack.clear();
        System.out.println("Stack: "+stack.isEmpty());
        stack.push('A');
        stack.push('D');
        stack.push('E');
        while (!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }
    }
}
