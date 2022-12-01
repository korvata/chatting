import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Window {

    private final BufferedReader br;

    public Window() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start() {
        while (true) {
            String loginCommand = getLoginWindowCommand();                                        //명령 입력
            if ("1".equals(loginCommand)) {                                                       //로그인 명령일 경우
                String id = getLogin();                                                           //로그인 시 ID를 먼저 받는다
                while (true) {
                    String chatWindowCommand = getChatWindowCommand();
                    switch (chatWindowCommand) {
                        case "1" :
                        case "2" :
                        case "3" :
                        case "4" : {
                            break;
                        }
                        default:
                            System.out.println("wrong command!");
                            break;
                    }
                    if ("4".equals(chatWindowCommand)) {
                        break;
                    }
                }
            } else if ("2".equals(loginCommand)) {                                                 //종료 명령일 경우
                break;
            }
        }
    }

    //로그인창 입력 받기
    private String getLoginWindowCommand() {
        System.out.println("1. Log in");
        System.out.println("2. Exit");

        return getInput();
    }

    //로그인
    private String getLogin() {
        System.out.print("ID: ");
        return getInput();
    }

    //채팅창 입력 받기
    private String getChatWindowCommand() {
        System.out.println("1. List");
        System.out.println("2. Make");
        System.out.println("3. Join");
        System.out.println("4. Log out");

        return getInput();
    }

    //채팅방 입력 받기
    private String getRoomWindowCommand() {
        System.out.println("1. Read");
        System.out.println("2. Write");
        System.out.println("3. Reset");
        System.out.println("4. Exit");

        return getInput();
    }

    //입력 처리
    private String getInput() {
        String input = null;
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
