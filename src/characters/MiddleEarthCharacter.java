package characters;

public abstract class MiddleEarthCharacter 
{
	private String name;
	private double health;
	private double power;
	
	
	
	/** Constructor for MiddleEarthCharacter
	 * @param name is the name of the character
	 * @param health indicates character HP 
	 * @param power indicates damage points the character inflicts
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		super();
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	/** This is an abstract method for when a character attacks another character
	 * @param target is the character being attacked
	 * @return true if the attack is successful and reduced target’s health, 
	 * 		   false if the attack was ineffective, or attack was against their own kin.
	 */
	public abstract Boolean attack(MiddleEarthCharacter target);
	
	/** This is an abstract method to get the race of a character
	 * @return returns the race name of the character as a string 
	 */
	public abstract String getRace();
	
	/** prints out the Name, Health and power of a character 
	 */
	public void displayInfo() {
		System.out.println(this.toString());
	}
	

	/** toString method returns name health and power, used in displayInfo 
	 *
	 */
	@Override
	public String toString() {
		return "Name: " + getName() + "Health: " + getHealth() + "Power: " + getPower();
	}

	/** getter for name 
	 * @return name of character
	 */
	public String getName() {
		return name;
	}
	
	/** setter for name
	 * @param name of character
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/** Getter for health
	 * @return health
	 */
	public double getHealth() {
		return health;
	}
	
	/** Setter for health
	 * @param health
	 */
	public void setHealth(double health) {
		this.health = health;
	}
	
	/** Getter for power
	 * @return power
	 */
	public double getPower() {
		return power;
	}
	
	/** Setter for power
	 * @param power
	 */
	public void setPower(double power) {
		this.power = power;
	}
	

}
