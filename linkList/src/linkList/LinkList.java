package linkList;

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>ls=new LinkedList<String>();
		ls.add("subod");
		ls.add("kumar");
		System.out.println(ls);
		ls.addFirst("name");
		ls.addLast("mahto");
		//System.out.println(ls);
		ls.add(0,"Er.");
		//System.out.println(ls);
		//System.out.println(ls.get(0));
		ls.remove(0);
		ls.removeFirst();
		System.out.println(ls);
		ls.remove(ls);
		System.out.println(ls);
		

	}

}
