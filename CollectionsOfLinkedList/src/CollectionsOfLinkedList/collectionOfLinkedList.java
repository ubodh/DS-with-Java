package CollectionsOfLinkedList;

import java.util.LinkedList;

public class collectionOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           LinkedList<Integer> list=new LinkedList<>();
           list.add(10);
           list.add(20);
           list.add(1,122);
           list.addFirst(222);
           list.addLast(121121);
           list.set(0, 10100110);
           list.removeFirst();
           list.removeLast();
           list.remove();//first element
           System.out.println(list.get(1));
           System.out.println(list);
           System.out.println(list.size());
           for(int i=0;i<list.size();i++) {
        	   System.out.print(list.get(i)+" ");
           }
	}

}
