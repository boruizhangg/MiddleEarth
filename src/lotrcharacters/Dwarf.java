package lotrcharacters;

public class Dwarf extends MiddleEarthCharacter{

	/**
	 * Constructor for Dwarf
	 * @param name
	 * 		Name of the Dwarf
	 * @param health
	 * 		Health points of the Dwarf
	 * @param power
	 * 		Attack power of the Dwarf
	 */
	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}

	/**
	 * Parameterized method that performs and attack on a target character.
	 * Dwarfs deal 1.5x damage to Elves, normal damage to Humans and Orcs, 
	 * and no damage to Dwarfs or Wizards.
	 * @param target
	 * 		The character being attacked
	 * @return 
	 * 		True if the attack is successful, false otherwise
	 */
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

	/**
	 * Method that returns the race of the character.
	 */
	@Override
	public String getRace() {
		return "Dwarf";
	}

}
