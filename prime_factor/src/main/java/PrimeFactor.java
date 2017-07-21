import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	private List<Integer> list = new ArrayList<Integer>();

	public List<Integer> of(int number) {

		if (number <= 1) {
			return list;
		} else if (number == 2 || number == 3) {
			list.add(number);
		} else {
			if (number % 2 == 0) { // Even
				number = number / 2;
				list.add(2);
				if (number == 2 || number == 3) {
					list.add(number);
				} else {
					of(number);
				}
				
			} else { // Odd
				number = number / 3;
				list.add(3);
				if (number == 3) {
					list.add(number);
				} else {
					of(number);
				}
				
			}
		}
		return list;
	}
}
