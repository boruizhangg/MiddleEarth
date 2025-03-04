package lotrcharacters;

public class Wizard extends MiddleEarthCharacter{
	
	public double totalDamage; 
	public double baseDamage = 2;
	// declare character
	public Wizard(String name, double health, double power) 
	{
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean attack(MiddleEarthCharacter target)
	{
		double targetHealth = target.getHealth();
		if(target.getRace().equals("Dwarf")||target.getRace().equals("dwarf"))
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
		else if(target.getRace().equals(null))
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
		// TODO Auto-generated method stub
		return "Wizard";
	}

}
