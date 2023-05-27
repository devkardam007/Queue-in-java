public class queueUsingArray {
    static class queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        queue(int n){
            arr = new int[n];
            size = n;
        }

        // Check Queue is Empty
        public static boolean isEmpty(){
            return rear == -1;
        }

        // Enqueue
        public static void add (int data){
            if (rear == size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Dequeue
        public static int remove(){
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            if (rear >= 0) System.arraycopy(arr, 1, arr, 0, rear);
            rear--;
            return front;
        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.remove();
        q.add(6);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
