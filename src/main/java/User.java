import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private List<String> joinedChannel;

    public User() {
        joinedChannel = new ArrayList<>();
    }

    public User(String id) {
        this.id = id;
        joinedChannel = new ArrayList<>();
    }

    public List<String> getJoinedChannel() {
        return joinedChannel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
