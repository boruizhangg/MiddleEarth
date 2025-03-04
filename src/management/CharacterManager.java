package management;

import characters.MiddleEarthCharacter;

public class CharacterManager {
	 	private MiddleEarthCharacter[] character;
		private int size;
		public int getSize() {
			return size;
		}

		
		/**Default constructor of the character manager with array of size 8
		 */
		public CharacterManager() {
			this.character = new MiddleEarthCharacter[8];
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
			if(character.length == size)
			{
				MiddleEarthCharacter[] characterExpansion = new MiddleEarthCharacter[character.length *2];
				for(int i = 0; i < size; i++)
				{
					characterExpansion[i] = character[i];
				}
				character = characterExpansion;
				character[size++] = c;
				System.out.println("Character Addition successful");
				return true;
			}
			else
			{
				character[size++] = c;
				System.out.println("Character Addition successful");
				return true;
			}
			
			
		}
		
		public MiddleEarthCharacter getCharacter(String name)
		{
			if(name == null)
			{
				return null;
			}
			for(int i = 0; i < size; i++)
			{
				if(character[i] != null && character[i].getName().equals(name))
				{
					return character[i];
				}
			}
			return null;
		}
		
		
		
		
		
		
		
		public void setSize(int size) {
			this.size = size;
		}

		public MiddleEarthCharacter[] getCharacters() {
			return character;
		}

		public void setCharacters(MiddleEarthCharacter[] characters) {
			this.character = characters;
		}

		private MiddleEarthCharacter[] characters;
		
		
		
		
		
		
		
}
