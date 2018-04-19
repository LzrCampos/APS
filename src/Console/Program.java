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
        list.add(new Pet("a", 8));
        list.add(new Pet("b", 3));
        list.add(new Pet("c", 20));
        
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        
        System.out.println(list.getElement(0));
        //System.out.println(list.getElement(1));
        //System.out.println(list.getElement(2));
        //System.out.println(list.getElement(3));
        //System.out.println(list.getElement(4));
        
        
        //PILHA DINAMICA
        /*
        Stack stack = new Stack();
        
        stack.push(new Pet("gatin", 10));
        stack.push(20);
        stack.push(30);
        
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


