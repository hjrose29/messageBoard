package bench;
import java.util.ArrayList;

public class seqMessageBoard{
    private ArrayList<String> messages;

    public seqMessageBoard(ArrayList<String> messages){
        this.messages = messages;
    }
    public seqMessageBoard(){
        this.messages = new ArrayList<String>();
    }


    public synchronized String writeMessage(String message){
        messages.add(message);
        return message;
    }
    
    public synchronized ArrayList<String> readMessages() {
        return new ArrayList<>(messages);
    }
}