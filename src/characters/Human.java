package characters;

public class Human extends MiddleEarthCharacter{
	
	//declare totalDamage
	public double totalDamage; 
	
	public Human(String name, double health, double power) 
	{
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean attack(MiddleEarthCharacter target) 
	{
		if(target.getRace().equals("Wizard") || target.getRace().equals("wizard") )
		{
			System.out.println("1.5 x damage against Wizard");
			totalDamage = this.getPower() * 1.5;
		
		}
		else if(target.getRace() == "Orc" || target.getRace() == "orc")
		{
			System.out.println("Ineffective (0 damage) against Orc");
		}
		if(target.getRace() == "Human" || target.getRace() == "human")
		{
			System.out.println("Ineffective (0 damage) against Human");
		}
		return null;
	}

	@Override
	public String getRace() 
	{
		
		return null;
	}

	
}
