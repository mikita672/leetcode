import java.util.LinkedList;
import java.util.Queue;

public class _225_Implement_Stack_using_Queues {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(10);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();

        System.out.println(Integer.toString(param_2) + Integer.toString(param_3) + Boolean.toString(param_4));
    }
}

class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 1; i < q.size(); i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        if (q.isEmpty()) return 0;
        return q.element();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
