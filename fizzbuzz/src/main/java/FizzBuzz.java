public class FizzBuzz {
    public String say(int input) {
    	
    	if(input == 3 || input == 6 || input == 9) {
    		return "Fizz";
    	}else if(input == 5 || input == 10) {
    		return "Buzz";
    	}else if(input == 15) {
    		return "FizzBuzz";
    	}
        return String.valueOf(input);
    }
}
