package management;
import characters.MiddleEarthCharacter;

public class MiddleEarthCouncil {
	
	private static MiddleEarthCouncil instance;
	private CharacterManager characterManager;
	
	private MiddleEarthCouncil() {
		characterManager = new CharacterManager();
	}
	
	public static MiddleEarthCouncil getInsatnce() {
		if(instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}
	
	public CharacterManager getCharacterManager() {
		return characterManager;
	}
	
}
