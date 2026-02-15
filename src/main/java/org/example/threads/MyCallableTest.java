package org.example.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class MyCallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        List<Future> allFutures;

            ExecutorService service = Executors.newFixedThreadPool(10);
            allFutures = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                Future<Integer> future = service.submit(new Task());
                allFutures.add(future);
            }

        // 100 futures with 100 placeholders

        for (int i  = 0; i < 100; i++) {
            Future<Integer> future = allFutures.get(i);
            Integer result = future.get(1, TimeUnit.SECONDS);
            System.out.println("Result of Future #" + i + " = "+ result);
        }
        
    }
    
    static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return new Random().nextInt();
        }
    }
}
