package lotrcharacters;

public class Orc extends MiddleEarthCharacter{

	public double totalDamage; 
	public double baseDamage = 2;
	// declare character from user
	public Orc(String name, double health, double power) 
	{
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean attack(MiddleEarthCharacter target)
	{
		double targetHealth = target.getHealth();
		if(target.getRace().equals("Human")||target.getRace().equals("human"))
		{
			totalDamage = baseDamage * 1.5;
			targetHealth = targetHealth - totalDamage;
			return true;
		}
		else if(target.getRace().equals( "Orc") || target.getRace() == "orc")
		{
			return false;
		}
		else if(target.getRace().equals("Elf") || target.getRace().equals("elf"))
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
		return "Orc";
	}

}
