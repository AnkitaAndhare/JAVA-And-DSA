public class Stack_Array {
 
    private int arr[];
    private int size;
    private int top;
   
    public Stack_Array(int n){   // constructor
        size = n;
        arr = new int[n];
        top = -1;
    }

    // add
    public void push(int data){
        if (top == size-1) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        arr[top] = data;
    }

    public boolean isEmpty(){
        return top == -1;
    }


    // Remove
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        int value = arr[top];
        top--;
        return value;
    }

    // peek
    public  int peek(){
        if (isEmpty()) {
           System.out.println("Stack is empty"); 
           return -1;
        }
        return arr[top];
    }

    public boolean isFull(){
        return top == size-1;
    }

    public static void main(String[] args) {

        Stack_Array  s = new Stack_Array(5);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

      //  System.out.println(s.peek());  // top element
      
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
