import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParllelStream {

    public static void main(String[] args) throws Exception {
        System.out.println(Thread.currentThread().getName());
        ForkJoinPool customJoinPool = new ForkJoinPool(4);
        List<String> data =
                IntStream.range(0, 100).mapToObj(i -> "item" + (i + 1)).collect(Collectors.toList());
      /*  Future<?> future = customJoinPool.submit(() -> data.parallelStream().forEach(item -> {
                    System.out.println(Thread.currentThread().getName() + " :" + item);
                })
        );*/

        Future<?> future = customJoinPool.submit(() -> {
                    //List<String> output = new ArrayList<>();
                    Queue<String> output = new ConcurrentLinkedDeque<>();
                    data.parallelStream().forEach(item -> {
                                String result = Thread.currentThread().getName() + " : " + item;
                                output.add(result);
                            }
                    );
                    List<String> sortedOutput = new ArrayList<>(output);
                    sortedOutput.sort(Comparator.naturalOrder());
                    sortedOutput.forEach(System.out::println);
                }
        );


        future.get();
        customJoinPool.shutdown();

    }
}
