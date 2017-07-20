public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
    	int length = input.length();
    	String result = "";
    	for(int i=0; i<length; i++) {
    		if(input.charAt(i) != '-' && input.charAt(i) != ' ') {
    			result += input.charAt(i); 
    		}
    	}
        return result;
    }

    public String solution(String input) {
    	FormatPhoneNumber phone = new FormatPhoneNumber();
    	String number = phone.removeNonDigit(input);
    	int length = number.length();
    	String resultFormat = "";
    	
    	for(int i=0; i<length; i++) {
    		if(i>0 && i%3 == 0) {
    			resultFormat += "-"+ number.charAt(i);
    		}else {
    			resultFormat += number.charAt(i);
    		}
    		
    	}
    	
        return resultFormat;
    }

}
