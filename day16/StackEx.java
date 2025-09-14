import java.util.Stack;
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        System.out.println(st);
        // adding the values into the stack
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        // remove the value 
        int val= st.pop();
        System.out.println(st);
        System.out.println(val);
        // getting the top value 
        int top= st.peek();
        System.out.println(top);
        System.out.println(st);
        // getting the size of the stack
        System.out.println(st.size());
        // check if stack is empty
        System.out.println(st.isEmpty());
    }
}
