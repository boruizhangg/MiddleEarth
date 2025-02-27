package management;

import characters.MiddleEarthCharacter;

public class CharacterManager {
		private int size;
		private MiddleEarthCharacter[] characters;
		
		public boolean addCharacter(MiddleEarthCharacter c)
		{
			if(c == null)
			{
				System.out.println("Illegal input for character field, character addition failed");
				return false;
			}
			
			else if(characters.length == size)
			{
				MiddleEarthCharacter[] characterExpansion = new MiddleEarthCharacter[size*2];
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
				return true;
			}
			
			
		}
		
		public MiddleEarthCharacter getCharacter(String name)
		{
			
		}
		
}
