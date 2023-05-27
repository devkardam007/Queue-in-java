public class  queueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class queue{
        static Node head = null;
        static Node tail = null;


        // Check Queue is Empty
        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //Enqueue
        public static void add (int data){
           Node newNode = new Node(data);

            // 1st Elememnt is add
            if (tail == null){
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // Dequeue
        public static int remove(){
            int front = head.data;
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            if (head == tail){
                tail = null;
            }

            head = head.next;
            return front;
        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}


