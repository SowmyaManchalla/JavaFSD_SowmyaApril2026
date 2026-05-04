package Day15;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TC_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<>();
		q.add("A");
		q.add("B");
		q.add("C");
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q);
		
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		pq.add(30);
		pq.add(10);
		pq.add(20);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		
		//Deque - double ended queue 
		ArrayDeque<String> dq = new ArrayDeque();
		
		dq.offer("X");
		dq.offer("Y");
		dq.offer("Z");
		System.out.println(dq);

	}

}
