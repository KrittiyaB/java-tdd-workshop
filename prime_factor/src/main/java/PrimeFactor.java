import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public List<Integer> of(int number) {
		List<Integer> list = new ArrayList<Integer>();

		if (number == 2 || number == 3) {
			list.add(number);
		} else {
			if (number % 2 == 0) { // Even
				number = number / 2;
				list.add(2);

				if (number == 2 || number == 3) {
					list.add(number);
				} else {
					if (number % 2 == 0) {
						number = number / 2;
						list.add(number);
						if (number == 2 || number == 3) {
							list.add(number);
						}
					}
				}

			} else { // Odd

			}
		}
		return list;
	}
}
