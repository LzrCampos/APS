
package DynamicStack;

public class Node {
    protected Object value;
    protected Node next;
    
    public Node(){}
    
    public Node(Object value){
        this.value = value;
        this.next = null;
    }
    
    public void display(){
        System.out.println(value);
    }    
}
