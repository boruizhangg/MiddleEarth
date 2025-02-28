package characters;

public class Wizard extends MiddleEarthCharacter{

	// declare character
	public Wizard(String name, double health, double power) 
	{
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean attack(MiddleEarthCharacter target)
	{
		if(getRace() == "Dwarf" || getRace() == "dwarf")
		{
			System.out.println("1.5 x damage against Dwarf");
		}
		return null;
	}

	@Override
	public String getRace() 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
