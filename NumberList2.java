
import java.util.*;
public class NumberList2{

	public static void main(String[] args) {
		NumberList<Long> x = new NumberList<Long>();
		x.add((long) 5);
		ArrayList<Long>  c = new ArrayList<Long>();
		ArrayList<Long>  d = new ArrayList<Long>();
		d.add((long) 2);
		c.add((long) 2);
		c.add((long) 3);
		c.add((long) 4);
		x.addAll(c);
		System.out.println(x);
		System.out.println(x.retainAll(c));
		System.out.println(x);
		
	}

}
