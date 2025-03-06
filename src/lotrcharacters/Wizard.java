package lotrcharacters;

public class Wizard extends MiddleEarthCharacter{
	 
	/**
	 * Constructor for Wizard
	 * @param name
	 * 		Name of the Wizard
	 * @param health
	 * 		Health points of the Wizard
	 * @param power
	 * 		Attack Power of the Wizard
	 */
	public Wizard(String name, double health, double power) 
	{
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Parameterized method that performs and attack on a target character.
	 * Human deal 1.5x damage to Dwarf, normal damage to Elf and Orc, 
	 * and no damage to Human or Wizard.
	 * @param target
	 * 		The character being attacked.
	 * @return 
	 * 		True if the attack is successful, false otherwise
	 */

	@Override
	public Boolean attack(MiddleEarthCharacter target)
	{
		if(target.getRace().equals(null))
		{
			return false;
		}
		else if(target.getRace().equals("Dwarf"))
		{
			target.setHealth(Math.max(0, target.getHealth()-(1.5 * this.getPower())));
			return true;
		}
		else if(target.getRace().equals( "Human"))
		{
			return false;
		}
		else if(target.getRace().equals("Wizard"))
		{
			return false;
		}
		else 
		{
			target.setHealth(Math.max(0, target.getHealth()-this.getPower()));
			return true;
		}
	}
	
	
	/**
	 *  method use to return the race of character
	 */
	
	@Override
	public String getRace() 
	{
		return "Wizard";
	}

}
