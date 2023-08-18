public class Stack {
    private int[] items;
    private int size;
    private int top;

    public Stack(int capacity) {
        items = new int[capacity];
        size = capacity;
        top = -1;
    }

    public boolean isEmpty() {
    	return top == -1;
    }

    public boolean isFull() {
    	return top == size - 1;
    }

    public void push(int item) {
    	if(isFull()) {
    		System.out.println("Stack is full, cannot push item");
    	} else {
    		top++;
    		items[top] = item;
    	}
    }

    public int pop() {
    	if(isEmpty()) {
    		System.out.println("Stack is empty, cannot pop item");
    		return -1;
    	} else {
    		int item = items[top];
    		top--;
    		return item;
    	}
    }

    public int peek() {
    	if(isEmpty()) {
    		System.out.println("Stack is empty, cannot pop item");
    		return -1;
    	} else {
    		return items[top];
    	}
    }

    public void display() {
    	System.out.println("Stack: ");
    	for (int i = top; i >= 0; i--) {
    		System.out.println(items[i]);
    	}
    }
}
