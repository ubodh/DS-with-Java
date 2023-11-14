package queue;

import java.util.LinkedList;
import java.util.Queue;

public class queuetest {
	public static void fun(int n)
	{
	    Queue<Integer> q=new LinkedList();
	    q.add(0);
	    q.add(1);
	    for (int i = 0; i < n; i++)
	    {
	        int a = q.poll();
	        int b = q.poll();
	        q.add(b);
	        q.add(a + b);
	        System.out.print(a);
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		fun(n);
		
	}

}
