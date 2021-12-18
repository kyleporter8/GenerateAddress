
public class DirectionOfTravel {
	
	private String doT;
	private String position;
	
	/**
	 * set direction of travel
	 * @param String doT
	 */
	public void setDoT(String doT) {
		this.doT = doT;
	} // setDoT() method in DirectionOfTravel class
	
	/**
	 * get direction of travel
	 * @return doT String
 	 */
	public String getDoT() {
		return doT;
	}// getDoT() method in DirectionOfTravel class
	
	/**
	 * set position value
	 * @param String position
	 */
	public void setPosition(String position) {
		this.position = position;
	} // setPosition() method in Direction Of Travel class
	
	/**
	 * get position value
	 * @return String position
	 */
	public String getPosition() {
		return position;
	} // getPosition() method in DirectionOfTravel class
	
	/**
	 * set a random direction of travel
	 */
	public void setRandomDoT() {
		String doT;
		String[] doTArr = { "NB", "SB", "EB", "WB"};
		
		int randNum = (int)((Math.random() * doTArr.length));
		doT = doTArr[randNum];
		setDoT(doT);
	} // setRandomDoT() method in Direction of Travel class
	
	/**
	 * set position attribute to random value
	 */
	public void setRandomPos() {
		String pos;
		String[] posArr = {"NO", "SO", "EO", "WO", "UP", "OP", "ON", "OF"};
		
		int randNum = (int)((Math.random() * posArr.length));
		pos = posArr[randNum];
		setPosition(pos);
	} // setRandomPos() method in DirectionOfTravel class
	
	/**
	 * Constructor with params to set direction of travel & position
	 * @param doT
	 * @param 
	 */
	public DirectionOfTravel(String doT, String pos) {
		setDoT(doT);
		setPosition(pos);
	} // DirectionOfTravel() constructor in DirectionOfTravel class
	
	/**
	 * void constructor sets random direction of travel & position
	 */
	public DirectionOfTravel() {
		setRandomDoT();
		setRandomPos();
	} // DirectionOfTravel() constructor in DirectionOfTravel class
	
}// DirectionOfTravel class
