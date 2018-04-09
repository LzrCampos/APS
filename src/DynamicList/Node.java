package DynamicList;

public class Node {
    
    public Node(Object value){
        this.value = value;
        this.next = null;
    }
    
    protected Object value;
    protected Node next;
    
    public void displayNode() { 
        System.out.println(value.toString());
    }
    
}
