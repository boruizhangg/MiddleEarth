package management;

import lotrcharacters.MiddleEarthCharacter;

public class CharacterManager {
	 	private MiddleEarthCharacter[] characters;
		private int size;
		public int getSize() {
			return size;
		}

		
		/**Default constructor of the character manager with array of size 8
		 */
		public CharacterManager() {
			this.characters = new MiddleEarthCharacter[8];
			this.size = 0;
			
		}

		/**This is the dynamic array implementation for adding a new character
		 * @param c is the character you are adding
		 * @return true if adding a character was successful 
		 * 		   false if add character failed.
		 */
		public boolean addCharacter(MiddleEarthCharacter c)
		{
			if(c == null)
			{
				System.out.println("Illegal input for character field, character addition failed");
				return false;
			}
			if(getCharacter(c.getName()) != null)
			{
				System.out.println("Cannot add a duplicate character");
				return false;
			}
			if(characters.length == size)
			{
				MiddleEarthCharacter[] characterExpansion = new MiddleEarthCharacter[characters.length *2];
				for(int i = 0; i < size; i++)
				{
					characterExpansion[i] = characters[i];
				}
				characters = characterExpansion;
				characters[size++] = c;
				System.out.println("Character Addition successful");
				return true;
			}
			else
			{
				characters[size++] = c;
				System.out.println("Character Addition successful");
				return true;
			}
			
			
		}
		
		/**This searches for a character with a specific name
		 * @param name is the name of the character 
		 * @return null if the character is not found
		 * 		   the character with matching name
		 */
		public MiddleEarthCharacter getCharacter(String name)
		{
			if(name == null)
			{
				return null;
			}
			for(int i = 0; i < size; i++)
			{
				if(characters[i] != null && characters[i].getName().equals(name))
				{
					return characters[i];
				}
			}
			return null;
		}
		
		/**Updates character based on the parameter input using the setters of MiddleEarthCharacter
		 * @param character you want to update
		 * @param name updates name for character
		 * @param health updates the health for character
		 * @param power updates power for character
		 * @return true if there is a change
		 * 		   false if there is no change or illegal inputs or character not found
		 */
		public boolean updateCharacter (MiddleEarthCharacter character, String name, double health, double power)
		{
			if(character == null || name == null || health <= 0 || power <= 0)return false;
			boolean flag = false;
			for(int i = 0; i < size; i++)
			{
				if(characters[i] == character)
				{
					flag = true;
				}
			}
			
			if(flag == false)
			{
				System.out.println("Could not find the character to update");
				return false;
			}
			
			flag = false;
			if(!name.equals(character.getName()))
			{
				character.setName(name);
				flag = true;
			}
			if(health != character.getHealth())
			{
				character.setHealth(health);
				flag = true;
			}
			if(power != character.getPower())
			{
				character.setPower(power);
				flag = true;
			}
			if(flag)
			{
				System.out.println("Character update applied");
				return true;
			}
			else
			{
				System.out.println("No updates were made");
				return false;
			}
		}
		
		
		
		
		
		public void setSize(int size) {
			this.size = size;
		}

		public MiddleEarthCharacter[] getCharacters() {
			return characters;
		}

		public void setCharacters(MiddleEarthCharacter[] characters) {
			this.characters = characters;
		}

		private MiddleEarthCharacter[] characters;
		
		
		
		
		
		
		
}
