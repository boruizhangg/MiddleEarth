package characters;

public class Dwarf extends MiddleEarthCharacter{

	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	public Boolean attack(MiddleEarthCharacter target) {
		if(target instanceof Dwarf || target instanceof Wizard){
			return false;
		}
		else if(target instanceof Elf) {
			target.setHealth(target.getHealth() - (1.5 * this.getPower()));
		}
		else {
			target.setHealth(target.getHealth() - this.getPower());
		}
		return true;
	}

	@Override
	public String getRace() {
		// TODO Auto-generated method stub
		return null;
	}

}
