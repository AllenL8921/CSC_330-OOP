import java.util.ArrayList;

public class MidtermReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date, month, year;
		date = 15;
		month = 3;
		year = 2023;
		
		String str = " ";
		
		str += month + "/" + date + "/" + year;
		System.out.println(str);
		
		
		//Compare which name comes later in the dictionary
		
		String name = "Ally".toLowerCase();
		String otherName = "Ally";
		
		System.out.println(name.compareTo(otherName));
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(date);
		arr.add(month);
		arr.add(year);

		for(Integer i : arr) {
			System.out.println(i);
		}
		
	}

}