public class circularQueueUsingArray {
    static class queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        queue(int n){
            arr = new int[n];
            size = n;
        }

        // Check Queue is Empty
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        // Check Queue is Full
        public static boolean isFull(){
            return (rear+1) % size == front;
        }

        //Enqueue
        public static void add (int data){
            if (isFull()){
                System.out.println("Queue is Full");
                return;
            }

            // 1st Elememnt is add
            if (front == -1){
                front=0;
            }

            rear = (rear+1) % size;
            arr[rear] = data;
        }

        // Dequeue
        public static int remove(){
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            if (rear == front){
                rear = front = -1;
            } else {
                front = (front+1) % size;
            }
            return result;
        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
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
