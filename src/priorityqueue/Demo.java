package priorityqueue;

public class Demo {
    public static void main(String[] args)
    {
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(1);
        priorityQueue.offer(9);
        priorityQueue.offer(3);

        while (!priorityQueue.isEmpty())
        {
           //System.out.println(priorityQueue.peak());
           System.out.println(priorityQueue.poll());
        }
    }
}
