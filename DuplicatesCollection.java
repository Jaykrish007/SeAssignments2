package Assignments2Java;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicatesCollection {
public static void main(String[] args) {
	int[] data= {1,3,8,3,11,5,6,4,7,6,7};
	
	List<Integer>list = new ArrayList<Integer>();
	list.add(1);
	list.add(3);
	list.add(8);
	list.add(3);
	list.add(11);
	list.add(5);
	list.add(6);
	list.add(4);
	list.add(7);
	list.add(6);
	list.add(7);
	

	System.out.println("The duplicate list are:" + list);
	
	Set<Integer> s = new TreeSet<Integer>();
	s.addAll(list);
	System.out.println("The original list are:"+s);
	
	
	
	
}
}
