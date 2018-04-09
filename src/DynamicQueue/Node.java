package DynamicQueue;

public class Node{

    public Object getObject() {
        return _object;
    }

    public Node getNext() {
        return _next;
    }
    
    public void setNext(Node next) {
        this._next = next;
    }
    
        private Object _object;             
        private Node _next;              
        
        public Node(Object p) { 
            this._object = p;
            _next = null;
            Object o = p;
        }
        
        public void displayNode() { 
            System.out.println(getObject().toString()); 
        }
}
