import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> data = Arrays.asList("item1", "item2", "item3");
        data.parallelStream().forEach((item) -> {
            System.out.println(Thread.currentThread().getName() + " : " + item);
        });
    }
}