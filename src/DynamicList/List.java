package DynamicList;

public class List implements IList {

    public List() {
        this._fistNode = null;
        this._lastNode = null;
        this._index = 0;
    }

    private Node _fistNode, _lastNode;
    private int _index;

    @Override
    public void add(Object value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            _fistNode = newNode;
            _lastNode = _fistNode;
        } else {
            _lastNode.next = newNode;
            _lastNode = newNode;
        }
    }

    @Override
    public Object remove(Object value) {
        if(isEmpty()) {
            return null;
        } else {
            Node current = _fistNode;
            while (current != null) {
                if(value.toString() == current.value.toString()){
                    
                }
                //current.displayNode();
                //current = current.next;
            }
            return null;
        }
    }

    @Override
    public Object alter(Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        return this._fistNode == null;
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.print("Lista vazia.");
        } else {
            Node current = _fistNode;
            while (current != null) {
                current.displayNode();
                current = current.next;
            }
            System.out.println();
        }
    }

}
