package characters;

public class Elf extends MiddleEarthCharacter{

	/**
	 * Constructor for Elf
	 * @param name
	 * 		Name of the Elf
	 * @param health
	 * 		Health points of the Elf
	 * @param power
	 * 		Attack Power of the Elf
	 */
	public Elf(String name, double health, double power) {
		super(name, health, power);
	}
	
	/**
	 * Parameterized method that performs an attack on a target character.
	 * Elves deal 1.5x damage to Orcs, normal damage to Humans and Wizards, 
	 * and no damage to Elves or Dwarfs
	 * @param target
	 * 		The character being attacked
	 * @return 
	 * 		True if the attack is successful, false otherwise
	 */	 
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

	/**
	 * Method that returns the race of the character
	 */
	@Override
	public String getRace() {
		return "Elf";
	}

}
