import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello!");

        List<String> list = List.of("me", "and", "you");
        for (String s : list) {
            System.out.println(s);
        }
    }
}