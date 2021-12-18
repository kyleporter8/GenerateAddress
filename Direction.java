
public class Direction {

	private String dir;
	
	/**
	 * set direction
	 * @param String dir
	 */
	public void setDir(String dir) {
		this.dir = dir;
	} // setDir() method in Direction class
	
	/**
	 * get Direction
	 * @return String dir
	 */
	public String getDir() {
		return dir;
	} // getDir() method in Direction class
	
	/**
	 * set direction to random String
	 */
	public void setRandomDirection() {
		
		String[] dirArr = {"N", "S", "E", "W"};
		String dir = dirArr[(int)((Math.random() * 4))];
		setDir(dir);
		
	} // setRandomDirection() method in Direction class
	
	/**
	 * constructor w/parm to set direction
	 * @param dir
	 */
	public Direction(String dir) {
		setDir(dir);
	} // Direction() constructor in Direction class
	
	/**
	 * default void constructor sets random direction
	 */
	public Direction() {
		
		setRandomDirection();
		
	} // void Direction() constructor in Direction class

} // Direction class
