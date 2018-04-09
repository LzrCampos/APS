package DynamicStack;

public class Stack implements IStack {

    //private int index = 0;
    private Node top;
    private int qtt;

    public Stack() {
        this.top = null;
        this.qtt = 0;
    }

    @Override
    public void push(Object value) {
        Node newNode = new Node(value);

        newNode.next = this.top;
        this.top = newNode;
        this.qtt++;
    }

    @Override
    public Node pop() {
        Node temp = this.top;
        if (this.isEmpty()) {
            return null;
        } else {
            this.top = this.top.next;
            this.qtt--;
        }
        return temp;
    }

    @Override
    public Node peek() {
        try {
            return this.top;
        } catch (Exception ex) {
            return null;
        }

    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Pilha vazia.");
        } else {
            Node now = top;
            while (now != null) {
                now.display();
                now = now.next;
            }
            System.out.println();
        }
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public int size() {
        return this.qtt;
    }
}
