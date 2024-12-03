import java.util.LinkedList;
import java.util.Queue;

class CircularQueue<T> {
    private Queue<T> queue;
    private int size;

    public CircularQueue(int size) {
        this.size = size;
        this.queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        if (queue.size() < size) {
            queue.add(element);
        } else {
            throw new IllegalStateException("Queue is full.");
        }
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return queue.poll();
    }

    public T front() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int getSize() {
        return queue.size();
    }

    public Queue<T> getQueue() {
        return queue;
    }
}

public class CircularQueueGame {
    public static void main(String[] args) {
        int k = 0; // The counting number
        int numFriends = 0; // Number of friends

        System.out.println("Welcome to the Circular Queue Game!");
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Accept inputs for number of friends and k
        System.out.print("Enter the number of friends: ");
        numFriends = scanner.nextInt();
        System.out.print("Enter the count-off number (k): ");
        k = scanner.nextInt();

        // Create a circular queue to hold the friends
        CircularQueue<Integer> circularQueue = new CircularQueue<>(numFriends);

        // Enqueue all friends (represented as their numbers)
        for (int i = 1; i <= numFriends; i++) {
            circularQueue.enqueue(i);
        }

        // Process the game
        System.out.println("Game started!");
        while (circularQueue.getSize() > 1) {
            // Count up to k
            for (int i = 1; i < k; i++) {
                circularQueue.enqueue(circularQueue.dequeue());
            }
            // Remove the k-th friend
            System.out.println("Friend " + circularQueue.dequeue() + " is removed.");
        }

        // The last remaining friend is the winner
        System.out.println("The winner is friend " + circularQueue.front() + "!");
        scanner.close();
    }
}
