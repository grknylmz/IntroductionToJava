package MultithreadingAndParallelProgramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Gürkan on 24.3.2015.
 */
public class ConsumerProducer {
    private static Buffer buffer = new Buffer();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new ProducerTask());
        executor.execute(new ConsumerTask());
        executor.shutdown();
    }

    private static class ProducerTask implements Runnable{
        public void run(){
            try {
                int i = 1;
                while (true){
                    System.out.println("Producer writes " + i );
                    buffer.write(i++);

                    Thread.sleep((int)(Math.random()*10000));

                }
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }

        }
    }
}
