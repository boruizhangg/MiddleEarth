package lotrcharacters;

public class Human extends MiddleEarthCharacter{
	
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
			double dmg = this.getPower() * 1.5;
			target.setHealth(target.getHealth() - dmg);
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
			target.setHealth(target.getHealth() - this.getPower());
			return true;
		}
	}

	@Override
	public String getRace() 
	{
		return "Human";
	}

	
}
