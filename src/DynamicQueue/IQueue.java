package DynamicQueue;

public interface IQueue {
    boolean isEmpty();
    void enqueue(Object p);
    Object dequeue();
    void display();
}
