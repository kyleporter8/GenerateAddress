
public class Suffix {
	
	private String suffix;
	
	/**
	 * set Suffix
	 * @param String suffix
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	} // setSuffix() method in Suffix class
	
	/**
	 * get Suffix
	 * @return String suffix
	 */
	public String getSuffix() {
		return suffix;
	} // getSuffix() method in Suffix class
	
	/**
	 * Constructor with param to set Suffix
	 * @param suffix
	 */
	public Suffix(String suffix) {
		setSuffix(suffix);
	} // Suffix() constructor in Suffix class
	
	/**
	 * default void Constructor
	 * generates random suffix
	 */
	public Suffix() {
		String suffix;
		String[] suffixArr = {"ST", "PL", "WY", "AV", "DR", "LN",
							  "ML", "PS", "PA", "PW", "RR", "RD",
							  "AC", "FY", "PT", "WW", "EX", "VS"};
		
		suffix = suffixArr[(int)((Math.random() * suffixArr.length))];
		setSuffix(suffix);
	} // default Suffix() constructor in Suffix class
	
} // Suffix class
