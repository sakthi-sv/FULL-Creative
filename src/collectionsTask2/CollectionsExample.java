package collectionsTask2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("ArrayList");
		a1.add("LinkedList");
		a1.add("HashSet");
		a1.add("LinkedHashSet");
		a1.add("TreeSet");
		System.out.println(a1);
		Collections.sort(a1);
		for(String a:a1)
			System.out.println(a);
		System.out.println();
		LinkedHashSet<String> h1=new LinkedHashSet<String>();
		h1.add("ArrayList");
		h1.add("LinkedList");
		h1.add("HashSet");
		h1.add("LinkedHashSet");
		h1.add("TreeSet");
		Iterator itr=h1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println();
		TreeMap<Integer, String> m1=new TreeMap<Integer, String>();
		m1.put(1,"HashMap");
		m1.put(3,"LinkedHashMap");
		m1.put(2,"TreeMap");
		System.out.println(m1);
		for(Map.Entry m:m1.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
