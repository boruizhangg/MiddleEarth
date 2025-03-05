package rivendell;

import java.util.Scanner;

import management.CharacterManager;
import management.MiddleEarthCouncil;

public class Menu {
	
	private Scanner scanner;
	private CharacterManager characterManager;
	private boolean status;
	
	
	
	/**Constructor for menu class that gets the instance of characterManager from the singleton MiddleEarthCouncil
	 * 
	 */
	public Menu()
	{
		scanner = new Scanner(System.in);
		characterManager = MiddleEarthCouncil.getInstance().getCharacterManager();
		status = true;
	}
	
	public void displayMenu()
	{
		System.out.println("Welcome to the Middle Earth Character Management System, please enter your choice from 1 to 6 to do something"
				+ "1. New character addition"
				+ "2. Display all characters"
				+ "3. Update the information of a character"
				+ "4. BANISH your beloved character from the mortal realms! (delete character) "
				+ "5. war, wAR WARR! Starts a brawl (character attacks each other)");
	}
	
	
	public void useMenu()
	{
	
	}
	
	
}
