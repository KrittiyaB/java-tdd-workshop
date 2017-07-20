public class MyRange {
	public String of(String input) {
		return null;
	}

	public int getLastNumber(String input) {
		if(isก้ามปูปิด(input)) {
			return Character.getNumericValue(input.charAt(3));
		}
		return Character.getNumericValue(input.charAt(3))-1;

	}

	public boolean isก้ามปูปิด(String input) {
		if (input.charAt(4) == ']') {
			return true;
		}
		return false;
	}

	public int getFirstNumber(String input) {
		return Character.getNumericValue(input.charAt(1));
	}

	public boolean isก้ามปูเปิด(String input) {
		if (input.startsWith("[")) {
			return true;
		}
		return false;
	}
}
