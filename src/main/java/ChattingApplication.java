import java.util.HashMap;
import java.util.Map;

public class ChattingApplication {

    private static Window window = new Window();
    private static Map<String, User> userMap;
    private static Map<String, Room> channelMap;

    public ChattingApplication(Window display) {
        ChattingApplication.window = display;
    }
    public static void main(String[] args) {
        initConfiguration();
        window.start();
    }
    public static void initConfiguration() {
        userMap =  new HashMap<String, User>();
        channelMap =  new HashMap<String, Room>();
    }
}
