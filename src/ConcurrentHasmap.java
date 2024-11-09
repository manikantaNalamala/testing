import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class ConcurrentHasmap {
    public static void main(String[] args) {

        String s1 = new String("hello");
        StringBuffer stringBuffer = new StringBuffer("ghi");
        String s4 = "uweue";
        /*Myobj objnamne= new MyObj;
       MyObj obj = (MyObj)Class.forName("com.rs.MyObj").newInstance();
        MyObj obj=MyObj.class.newInstance();*/



        ConcurrentHashMap<String, Integer> concurrentHashmap = new ConcurrentHashMap<>();
        //HashMap<String, Integer> concurrentHashmap = new HashMap<>();
        // try bcz parallel-stream uses the forkjoin pool(multi threads at a time)
        //multi threads access the hashmap at a time  leads to the data inconsistency
        List<String> data = Arrays.asList("apple", "banana", "orange", "apple");
        data.parallelStream().forEach(item -> {
            concurrentHashmap.merge(item, 1, Integer::sum);
        });
        System.out.println(concurrentHashmap);


    }
}
