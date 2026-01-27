import java.util.Comparator;
import java.util.PriorityQueue;

public class PQStackQueue {
    static class Node {
        int value;
        int order; // Acts as a timestamp
        public Node(int value, int order) {
            this.value = value;
            this.order = order;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                return Integer.compare(n1.order, n2.order);
            }
        });
        int orderCounter = 0;
        queue.add(new Node(10, orderCounter++));
        queue.add(new Node(20, orderCounter++));
        queue.add(new Node(30, orderCounter++));
        System.out.println("Queue (FIFO) Poll:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll().value);
        }
        System.out.println("-----------------");
        PriorityQueue<Node> stack = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                return Integer.compare(n2.order, n1.order);
            }
        });

        orderCounter = 0;
        stack.add(new Node(10, orderCounter++));
        stack.add(new Node(20, orderCounter++));
        stack.add(new Node(30, orderCounter++));

        System.out.println("Stack (LIFO) Pop:");
        while (!stack.isEmpty()) {
            System.out.println(stack.poll().value);
        }
    }
}