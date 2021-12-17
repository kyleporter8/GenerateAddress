
public class City {
	
	private String code;
	
	/**
	 * set the city's code
	 * @return void
	 */
	public void setCode(String code) {
		this.code = code;
	} // setCode method in City class
	
	/**
	 * get city's code
	 * @return String code
	 */
	public String getCode() {
		return code;
	} // getCode() method in City class
	
	/**
	 * Constructor
	 * @param String code
	 */
	public City(String code) {
		setCode(code);
	}
	
	/**
	 * Void Constructor w/random code
	 */
	public City() {
		String code;
		String[] codes = {"HRQ", "TON", "BUC", "BUV", "GDY",
						   "LFP", "AVO", "TOL", "GLN", "PEO",
						   "SUN", "YNG", "ELM", "SCW", "SUR",
						   "WIT", "BCC", "DSY", "LAV", "PDV", 
						   "SCT", "TMP", "GUA", "CHA", "SLK", 
						   "MAR", "PHX", "GIB"};
		
		int randNum = (int)((Math.random() * codes.length));
		code = codes[randNum];
		setCode(code);
	}
	
}
