package MultithreadingAndParallelProgramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Gurkan on 19.03.2015.
 */
public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        executorService.execute(new PrintChar('a',100));
        executorService.execute(new PrintChar('b',100));


        executorService.execute(new PrintNum(100));

        executorService.shutdown();
    }
}
