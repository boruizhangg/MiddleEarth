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
		Human human = new Human("Joe",1,1);
		
		character.addCharacter(human);
	}

}
