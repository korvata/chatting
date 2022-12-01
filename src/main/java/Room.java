import java.util.ArrayList;
import java.util.List;

public class Room {
    private String roomName;
    private List<Message> messages;

    public Room() {
        messages = new ArrayList<Message>();
    }

    public Room(String roomName) {
        this.roomName = roomName;
        messages = new ArrayList<Message>();
    }
}
