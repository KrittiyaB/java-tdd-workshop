public class FormatPhoneNumber {

	public String removeNonDigit(String input) {
		int length = input.length();
		String result = "";
		for (int i = 0; i < length; i++) {
			if (input.charAt(i) != '-' && input.charAt(i) != ' ') {
				result += input.charAt(i);
			}
		}
		return result;
	}

	public String solution(String input) {
		FormatPhoneNumber phone = new FormatPhoneNumber();
		String number = phone.removeNonDigit(input);
		int lengthNumber = number.length();
		String resultFormat = "";
	
		if (lengthNumber % 3 == 1) {
			int index = 0;
			for (int i = 0; i < ((lengthNumber / 3) - 1) * 3; i += 3) {
				resultFormat += number.substring(i, i + 3) + "-";
				index = i + 3;
			}
			for (int j = index; j < lengthNumber; j += 2) {
				if (j + 2 > lengthNumber - 1) {
					resultFormat += number.substring(j, j + 2);
				} else {
					resultFormat += number.substring(j, j + 2) + "-";
				}
			}
		} else {
			for (int i = 0; i < lengthNumber; i++) {
				if (i > 0 && i % 3 == 0) {
					resultFormat += "-" + number.charAt(i);
				} else {
					resultFormat += number.charAt(i);
				}
			}
		}
		return resultFormat;
	}

}
