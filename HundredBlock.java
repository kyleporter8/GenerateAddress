import java.util.HashMap;
import java.util.Map;

public class HundredBlock {
	
	private Map<String, String> blocks = new HashMap<String, String>();
	
	/**
	 * get a hundred block for a street name
	 * @param street
	 * @return hundred block
	 */
	public String getHB(String street){
		return blocks.get(street);
	} // getHB() class in HundredBlock class
	

} //HundredBlock class
