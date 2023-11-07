package bench;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class parMessageBoard {
    private Queue<String> messages;

    public parMessageBoard() {
        // Create a ConcurrentLinkedQueue for storing messages
        messages = new ConcurrentLinkedQueue<>();
    }

    public void writeMessage(String message) {
        // Add a message to the queue
        messages.add(message);
    }

    public Object[] readMessages() {
        // Retrieve all messages from the queue
        return messages.toArray();
    }
}
