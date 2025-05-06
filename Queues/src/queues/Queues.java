package queues;

import java.util.*;


public class Queues {

    public static void main(String[] args) {

        Queue<Integer> que = new LinkedList<>();

        que.offer(5);
        que.offer(9);
        que.offer(14);
        que.offer(50);
        que.offer(99);
        que.offer(97);
        que.offer(19);
        que.offer(79);

        System.out.println(que);
        
        que.remove();
         System.out.println(que);
        que.poll();
         System.out.println(que);
    }

}
