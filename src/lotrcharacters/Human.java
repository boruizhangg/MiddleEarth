package lotrcharacters;

public class Human extends MiddleEarthCharacter{
	// declare damage
	public double totalDamage; 
	public double baseDamage = 2;
	
	public Human(String name, double health, double power) 
	{
		super(name, health, power);
	}

	@Override
	public Boolean attack(MiddleEarthCharacter target) 
	{
		double targetHealth = target.getHealth();
		if(target.getRace().equals("Wizard") || target.getRace().equals("wizard") )
		{
			totalDamage = baseDamage * 1.5;
			targetHealth = targetHealth - totalDamage;
			return true;
		}
		else if(target.getRace().equals( "Orc") || target.getRace() == "orc")
		{
			return false;
		}
		else if(target.getRace().equals("Human") || target.getRace().equals("human"))
		{
			return false;
		}
		else
		{
			targetHealth = targetHealth - baseDamage;
			return true;
		}
	}

	@Override
	public String getRace() 
	{
		return "Human";
	}

	
}
