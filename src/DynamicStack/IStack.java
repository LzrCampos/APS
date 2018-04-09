
package DynamicStack;

public interface IStack {
        void push(Object value);
	Node pop();
	Node peek();
        void display();
	boolean isEmpty();
        int size();
}
