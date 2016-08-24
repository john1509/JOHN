
public class Arrqueue {
    public static void main(String[] args){
    ArrayQueue objectque = new ArrayQueue(10);
    
    objectque.enqueue(2);
    objectque.enqueue(4);
    objectque.enqueue(6);
    objectque.enqueue(8);
    objectque.enqueue(10);
    objectque.enqueue(12);
    objectque.enqueue(14);
    objectque.enqueue(16);
    objectque.enqueue(18);
    objectque.enqueue(20);
    
    objectque.showQueue();
    System.out.println();
    System.out.println("PeekRear: " + objectque.peekRear());
    System.out.println("PeekFront: " + objectque.peekFront());
    
    System.out.println();
    objectque.enqueue(22);
    
    System.out.println();
    objectque.dequeue();
    
    System.out.println();
    objectque.showQueue();
}
}
