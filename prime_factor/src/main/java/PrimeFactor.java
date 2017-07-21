import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
    	List<Integer> list = new ArrayList<Integer>();
    	
    	if(number == 2 || number == 3) {
    		list.add(number);
    	}
        return list;
    }
}
