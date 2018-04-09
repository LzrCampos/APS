package Console;

import DynamicList.List;
import DynamicQueue.Queue;
import DynamicStack.Node;
import DynamicStack.Stack;

public class Program {
    public static void main(String[] args) {
        
        //FILA ENCADEADA
        
        List list = new List();
        
        list.add(new Pet("Dogst", 8));
        list.add(new Pet("Catu", 3));
        list.add(new Pet("Hantaro", 20));
        
        list.display();
        
        
        //PILHA DINAMICA
        /*
        Stack stack = new Stack();
        
        stack.push(new Pet("gatin", 10));
        stack.push(20);
        stack.push(30);
        
        Node n = new Node("");
        
        stack.display();
        *
        
        //FILA DINAMICA
        /*
        Queue row = new Queue();
        
        row.enqueue("teste");
        row.enqueue(new Pet("thor", 1));
        
        row.dequeue();
        
        row.display();
        */
    }
    public static class Pet{
        Pet(String name, int age){
            this.name = name;
            this.age = age;
        }
    String name;
    int age;
    
    public String toString(){
        return this.name;
    }
    }
    
}


