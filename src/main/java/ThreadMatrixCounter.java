import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadMatrixCounter {

    private ExecutorService executorService;

    public int countSum(int[][] matrix) throws InterruptedException {
        executorService = Executors.newFixedThreadPool(3);
        List<LineThread> threadList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            LineThread lineThread = new LineThread(matrix, i);
            Thread thread = new Thread(lineThread);
            threadList.add(lineThread);
            executorService.execute(thread);
        }

        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        return threadList.stream().map(x -> x.getSum()).mapToInt(x -> x).sum();
    }

    public boolean addOneIfEven(int[][] matrix) throws InterruptedException {
        executorService = Executors.newFixedThreadPool(3);
        List<AddThread> threadList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            AddThread addThread = new AddThread(matrix, i);
            Thread thread = new Thread(addThread);
            threadList.add(addThread);
            executorService.execute(thread);
        }

        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        return true;
    }

}
