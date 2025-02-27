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
	
	/**This is an abstract method to get the race of a character
	 * @return returns the race name of the character as a string 
	 */
	public abstract String getRace();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	

}
