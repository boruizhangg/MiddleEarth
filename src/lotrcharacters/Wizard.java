package lotrcharacters;

public class Wizard extends MiddleEarthCharacter{
	
	public double totalDamage; 
	public double baseDamage = 2;
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
	 * 		The character being attacked
	 * @return 
	 * 		True if the attack is successful, false otherwise
	 */

	@Override
	public Boolean attack(MiddleEarthCharacter target)
	{
		double targetHealth = target.getHealth();
		if(target.getRace().equals(null))
		{
			return false;
		}
		else if(target.getRace().equals("Dwarf")||target.getRace().equals("dwarf"))
		{
			totalDamage = baseDamage * 1.5;
			targetHealth = targetHealth - totalDamage;
			return true;
		}
		else if(target.getRace().equals( "Human") || target.getRace().equals("human"))
		{
			return false;
		}
		else if(target.getRace().equals("Wizard") || target.getRace().equals("wizard"))
		{
			return false;
		}
		else 
		{
			targetHealth = targetHealth - baseDamage;
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
