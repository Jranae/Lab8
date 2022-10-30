import java.util.*;
public class Search_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
	//Search the value red
		if (list_Strings.contains("Red")) {
			System.out.println("Found the element");
		}
		else {
			System.out.println("There is no such element");
		}
	}

}
