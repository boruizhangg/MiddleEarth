package rivendell;

import management.CharacterManager;
import management.MiddleEarthCouncil;

import java.util.Scanner;

import lotrcharacters.Dwarf;
import lotrcharacters.Elf;
import lotrcharacters.Human;
import lotrcharacters.MiddleEarthCharacter;
import lotrcharacters.Orc;
import lotrcharacters.Wizard;

public class MiddleEarthApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    CharacterManager cm = MiddleEarthCouncil.getInstance().getCharacterManager();
	    
	    while (true) {
	    	System.out.println("=========================");
	    	System.out.println("1. Add a new character");
	    	System.out.println("2. View all characters");
	        System.out.println("3. Update a character");
	        System.out.println("4. Delete a character");
	        System.out.println("5. Execute all characters’ attack actions");
	        System.out.println("6. Exit");
	        System.out.println("Enter your choice: ");
	        System.out.println("=========================");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add new character
                    System.out.print("Enter character type (Elf, Dwarf, Human, Orc, Wizard): ");
                    String type = scanner.next();
                    System.out.print("Enter character name: ");
                    String name = scanner.next();
                    System.out.print("Enter character health: ");
                    double health = scanner.nextDouble();
                    System.out.print("Enter character power: ");
                    double power = scanner.nextDouble();

                    MiddleEarthCharacter newCharacter = null;
                    switch (type.toLowerCase()) {
                        case "elf": newCharacter = new Elf(name, health, power); break;
                        case "dwarf": newCharacter = new Dwarf(name, health, power); break;
                        case "human": newCharacter = new Human(name, health, power); break;
                        case "orc": newCharacter = new Orc(name, health, power); break;
                        case "wizard": newCharacter = new Wizard(name, health, power); break;
                        default: System.out.println("Invalid character type."); continue;
                    }
                    cm.addCharacter(newCharacter);
                    System.out.println("Character added!");
                    break;
                case 2:
                    // View all characters
                    cm.displayAllCharacters();
                    break;
                case 3:
                    // Update character
                	System.out.print("Enter character name to update: ");
                    String nameToUpdate = scanner.next();
                    MiddleEarthCharacter characterToUpdate = cm.getCharacter(nameToUpdate);
                    if (characterToUpdate != null) {
                    	System.out.println("Enter new Name: ");
                    	String newName = scanner.next();
                        System.out.print("Enter new health: ");
                        double newHealth = scanner.nextDouble();
                        System.out.print("Enter new power: ");
                        double newPower = scanner.nextDouble();
                        cm.updateCharacter(characterToUpdate, newName, (int) newHealth, (int) newPower);
                        System.out.println("Character updated!");
                    } else {
                        System.out.println("Character not found.");
                    }
                    break;
                case 4:
                    // Delete character
                    System.out.print("Enter character name to delete: ");
                    String nameToDelete = scanner.next();
                    MiddleEarthCharacter characterToDelete = cm.getCharacter(nameToDelete);
                    if (characterToDelete != null) {
                        cm.deleteCharacter(characterToDelete);
                        System.out.println("Character deleted!");
                    } else {
                        System.out.println("Character not found.");
                    }
                    break;
                case 5:
                	// Execute all characters' attack actions
                    for (int i = 0; i < cm.getSize(); i++) {
                        for (int j = 0; j < cm.getSize(); j++) {
                            if (i != j) {
                                MiddleEarthCharacter attacker = cm.getCharacters()[i];
                                MiddleEarthCharacter target = cm.getCharacters()[j];
                                System.out.println(attacker.getName() + " attacks " + target.getName());
                                boolean attacked = attacker.attack(target);
                                if (attacked) {
                                    System.out.println(target.getName() + " has been attacked by " + attacker.getName() + ". Remaining Health: " + target.getHealth());
                                } else {
                                    System.out.println(target.getName() + " could not be attacked by " + attacker.getName());
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
	}
}
