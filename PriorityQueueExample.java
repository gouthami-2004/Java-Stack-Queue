import java.util.PriorityQueue;
public class PriorityQueueExample{
    public static void main(String[]args){
        //Min-heap(default)
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println("priorityQueue(Min-heap):");
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        //Max-heap using comparator
        PriorityQueue<Integer>maxpq = new PriorityQueue<>((a,b)->b-a);
        maxpq.offer(30);
        maxpq.offer(10);
        maxpq.offer(20);
        System.out.println("priorityQueue(Max-heap):");
        while(!maxpq.isEmpty()){
            System.out.println(maxpq.poll());
        }
    }
}