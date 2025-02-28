package characters;

public class Orc extends MiddleEarthCharacter{

	public Orc(String name, double health, double power) 
	{
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean attack(MiddleEarthCharacter target)
	{
		if(getRace() == "Human" || getRace() == "human")
		{
			System.out.println("1.5 x damage against Human");
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
