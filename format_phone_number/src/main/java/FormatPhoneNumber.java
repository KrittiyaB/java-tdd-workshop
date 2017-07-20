public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
    	int length = input.length();
    	String result = "";
    	for(int i=0; i<length; i++) {
    		if(input.charAt(i) != '-') {
    			result += input.charAt(i); 
    		}
    	}
        return result;
    }

    public String solution(String input) {
        return null;
    }

}
