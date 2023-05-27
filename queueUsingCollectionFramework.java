import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueUsingCollectionFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
