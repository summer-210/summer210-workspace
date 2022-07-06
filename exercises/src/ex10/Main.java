package ex10;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        PriorityQueue simplePQ = new SimplePriorityQueue();
        fillPQ(simplePQ);

        double time = 0;
        for(int i = 0; i < 1; i++) {
            double start = System.nanoTime();
            simplePQ.dequeue();
            double end = System.nanoTime();
            time += end - start;
        }
        time =  (time/10);
        System.out.println("old time: " + time);


        PriorityQueue binHeap = new MinBinHeap();
        fillPQ(binHeap);

        double newTime = 0;
        for(int i = 0; i < 1; i++) {
            double start = System.nanoTime();
            binHeap.dequeue();
            double end = System.nanoTime();
            newTime += end - start;
        }
        newTime = (newTime/10);
        System.out.println("new time: " + newTime);
        System.out.println("percent change: " + ((time - newTime) / time)* 100.0 );

    }

    public static void fillPQ(PriorityQueue pq) {
        for(int i = 0; i < 100000; i++) {
            pq.enqueue(i, calculatePriority());
        }
    }

    private static int calculatePriority() {
        Random random = new Random();
        int priority = (random.nextInt(1000000));
        return priority;
    }

}



