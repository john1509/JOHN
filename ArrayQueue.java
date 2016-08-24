/**Allyson Mae J. Tubtub
 * BSIS - II
 */

public class ArrayQueue {
 
  private int QMAX; 
  private int[] container;
  private int counter;
  
  public ArrayQueue(int size){
    QMAX = size;
    container = new int[QMAX];
  }
  
  public void showQueue(){
      int i;
      for(i = 0; i < QMAX; i++){
          System.out.printf("Queue[%d] = %d\n" , i , container[i]);
      }
  }
  
  public boolean enqueue(int num){
     System.out.println("Trying to enqueue " + num + "...");
     if(! isFull()){
         container[counter] = num;
         counter++;
         return true;
     }else{
         System.out.println("Failed to enque " + num);
         return false;
     }
  }
  
  public void dequeue(){
      System.out.print("Dequeueing...");
      if(! isEmpty()){
          int num = container[0];
          System.out.println("Removed " + num);
          rearrangeQueue();
      }else{
          System.out.println("Failed to dequeue");
      }

  }
  
  public boolean isFull(){
      if(counter == QMAX){
          System.out.println("QUEUE is FULL");
          return true;
      } else{
      return false;
    }
  }
  
  public boolean isEmpty(){
      if(counter == 0){
          System.out.println("QUEUE is EMPTY");
          return true;
      } else{
      return false;
      }
  }
  
  private void rearrangeQueue(){
      System.out.println("Rearranging Queue");
      int[] temp = new int[counter];
      int i;
      for(i = 0; i < (counter - 1); i++){
          temp[i] = container[i + 1];
      }
      counter--;
      for(i = 0; i < QMAX; i++){
          if(i <= counter){
              container[i] = temp[i];
          }else{
              container[i] = 0;
          }
      }
  }
  
  public int peekFront(){
    return container[0];
  }
  
  public int peekRear(){
    return container[counter-1];
  }
} //end class ArrayQueue

