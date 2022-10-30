import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class new_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>Number = new ArrayList<Integer>();
		Random Generator = new Random();
		Number.add(21);
		Number.add(8);
		Number.add(31);
		Number.add(45);
		Number.add(6);
		Number.add(7);
		Number.add(19);
		Number.add(15);
		Iterator<Integer> Iter = Number.iterator();
		
		while(Iter.hasNext())
		{
			
			Integer newNumber = Iter.next();
			if (newNumber>20)
				Iter.remove();
			if (newNumber<10)
				Iter.remove();
		}
		System.out.println("Printing the numbers betwenn 10 and 20: "+Number);
	}

}
