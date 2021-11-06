package com.collectionFrameworkExample;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> queue1 = new PriorityQueue<>();//PriorityQueue store values in sorting order..we can change this order by creating our own sortingorder in comparator class and passing to this queue
		queue1.add("Banana");
		queue1.offer("Apple");//add and offer methods both will add the values
		System.out.println(queue1);
		queue1.poll();//poll removes the 1st value in queue
		queue1.poll();
		System.out.println(queue1.poll());//gives null bca=z no elements there now
		System.out.println(queue1);//
				  
	}

}
