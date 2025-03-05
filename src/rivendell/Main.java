package rivendell;

import lotrcharacters.Elf;
import lotrcharacters.Dwarf;
import lotrcharacters.Human;
import lotrcharacters.Wizard;
import lotrcharacters.Orc;
import lotrcharacters.MiddleEarthCharacter;
import management.CharacterManager;

public class Main {

	public static void main(String[] args) {
		CharacterManager character = new CharacterManager();
		Human human = new Human("Jake",1,1);
		Elf elf = new Elf("Jack", 1,1);
		Orc orc = new Orc("Arc",1,1);
		Dwarf dwarf = new Dwarf("dip",1,1);
		Wizard wizard = new Wizard("W",1,1);
		
		
		character.addCharacter(human);
		character.addCharacter(elf);
		character.addCharacter(orc);
		character.addCharacter(dwarf);
		character.addCharacter(wizard);
		
		character.getCharacter("Orc");
		
		

	}

}
