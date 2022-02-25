import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class IteratorDemo2 {
	void Display(List<String> list) {
		Iterator<String> kj = list.iterator();
		while(kj.hasNext()) {
			System.out.println("The Element is:- " +kj.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> kj = new LinkedList<>();
		kj.add("HEY");
		kj.add("GOOD");
		kj.add("MORNING");
		kj.add("HAVE");
		kj.add("NICE");
		kj.add("DAY");
		System.out.println("The Element is:- " +kj);
		
		IteratorDemo2 jk = new IteratorDemo2();
		kj.sort(null);
		jk.Display(kj);
		System.out.println("************* ");
		Collections.reverse(kj);
		jk.Display(kj);
	}

}
