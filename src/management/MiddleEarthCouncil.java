package management;

public class MiddleEarthCouncil {
	
	private static MiddleEarthCouncil instance;
	private CharacterManager characterManager;
	
	/**
	 * Private constructor to prevent direct instantiation.
	 * Initializes the CharacterManager.
	 */
	private MiddleEarthCouncil() {
		characterManager = new CharacterManager();
	}
	
	/**
	 * This method returns the single instance of MiddleEarthCouncil 
	 * and ensures only one instance exists.
	 * 
	 * @return
	 * 		The single instance of MiddleEarthCouncil
	 */
	public static MiddleEarthCouncil getInstance() {
		if(instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}
	
	/**
	 * This method provides access to the CharacterManager.
	 * @return
	 * 		The CharacterManager instance
	 */
	public CharacterManager getCharacterManager() {
		return characterManager;
	}
	
}
