package characters;

public class Elf extends MiddleEarthCharacter{

	public Elf(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	public Boolean attack(MiddleEarthCharacter target) {
		if(target instanceof Elf || target instanceof Dwarf){
			return false;
		}
		else if(target instanceof Orc) {
			target.setHealth(target.getHealth() - (1.5 * this.getPower()));
		}
		else {
			target.setHealth(target.getHealth() - this.getPower());
		}
		return true;
	}

	@Override
	public String getRace() {
		return null;
	}

}
