package stack;

/**
 *
 * @author mansisaini
 */
public class Stack {
    
    private int maxSize;
    private long [] stackArray;
    private int top;
    
    public Stack(int max)
    {
        maxSize = max;
        stackArray = new long[maxSize];
        top = -1;
    }
    
    public void push(long element)
    {
        stackArray[++top] = element;
    }
    
    public long pop ()
    {
        return stackArray[top--];
    }
    
    public boolean isEmpty()
    {
        return (top == -1);
    }
    
    public boolean isFull()
    {
        return (top == maxSize-1);
    }
    
    public static void main(String[] args) 
    {
        Stack myStack = new Stack(10);
        
        myStack.push(2);
        myStack.push(4);
        myStack.push(6);
        myStack.push(8);
        myStack.push(10);
        
        while(!myStack.isEmpty())
        {
            long value = myStack.pop();
            System.out.println(value);
            System.out.println(" ");
        }
        System.out.println("");
        
    }
    
    
    
}
