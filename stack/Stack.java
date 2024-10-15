import java.util.*;

public class Stack{

private int[] arr;
private int maxSize;
private int idx;
 
public Stack(int size){
    
   
    this.arr= new int[maxSize];
    this.  maxSize= size;
    this.idx= 0;
}



public void push(int x){
    if(isFull()){
        System.out.println("Stack is Full, Cannot insert the value");
        return;
    }
    arr[idx]= x;
    idx ++;
}


public int pop(){
    if(isEmpty()){
        System.out.println("Stack is Empty, Cannot delete the value");
        return -1;
      
    }
    int top = arr[idx-1];
    arr[idx-1]=0;
    idx--;
    return top;
}

public int peek(int x){
    if(isEmpty()){
        System.out.println("Stack is Empty");
        return -1;
      
    }
   
    return arr[idx-1];
}


public boolean isEmpty(){
    return (idx==0);
}
public boolean isFull(){
    return (idx==maxSize);
}
public int size(){
    return idx;
}
   public int capacity(){
    return arr.length;
}




public static void main(String[] args) {
    Stack stack= new Stack (5);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.push(60);
    for(int i=0;i< stack.size();i++){
        System.out.print("The element in the stack is :" + stack.arr[i]);
    }
    System.out.println();
    stack.pop();




    
}
}
