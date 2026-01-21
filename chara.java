import java.util.Scanner;

public class chara{
    public static void character (){
        boolean a = false;
        

        
        System.out.println("Choose your race");
        System.out.println("Human: Very adaptive and innovative. +1 in all ability scores. Speed: 30ft, Size: Medium, type: Humanoid, Languages: Common + 1 other language, Traits: none ==1");
        System.out.println("Hill Dwarf: Keen senses, deep intuition and remarkable resilience. +2 in Constitution +1 in wisdom +1 in hit point maximum. Speed: 25ft, Size: Medium, type: Humanoid, Languages: Common + Dwarvish, Darkvision: up to 60ft, Traits: Dwarven Resilience, Dwarven combat training, Tool proficiency, Stonecunning ==2"); 
System.out.println("Mountain Dwarf: Strong, hardy, accustomed to difficult terrain. +2 in Constitution +2 in strength. Speed: 25ft, Size: Medium, type: Humanoid, Languages: Common + Dwarvish, Darkvision: up to 60ft, Traits: Dwarven Resilience, Dwarven combat training, Tool proficiency, Stonecunning, Dwarven Toughness ==3");
System.out.println("High Elf: Keen mind and a mastery of basic magic. +2 in dexterity +1 in intelligence. Speed: 30ft, Size: Medium, type: Humanoid, Languages: Common + Elvish + 1 other Language, Darkvision: up to 60ft, Traits: Fey Ancestry, Keen Senses, Trance, Elf weapon Training, cantrip ==4");
System.out.println("Wood Elf: Keen senses and intuition, very quick and stealthy in their native forests. +2 in dexterity +1 in wisdom. Speed: 35ft, Size: Medium, type: Humanoid, Languages: Common + Elvish, Darkvision: up to 60ft, Traits: Fey Ancestry, Keen Senses, Trance, Elf weapon Training, Mask of the wild ==5");
System.out.println("Dark Elf (Drow): Following a path of evil and corruption. +2 in dexterity +1 in charisma. Speed: 30ft, Size: Medium, type: Humanoid, Languages: Common + Elvish, Darkvision: up to 120ft, Traits: Fey Ancestry, Keen Senses, Trance, Drow weapon Training, Sunlight sensitivity, Drow magic ==6");
System.out.println("Tiefling: +2 in Charisma +1 in intelligence. Speed: 30ft, Size: Medium, type: Humanoid, Languages: Common + Infernal, Darkvision: up to 60ft, Traits: Hellish resistance, Infernal Legacy ==7");
Scanner sc2 = new Scanner(System.in);
int rc = sc2.nextInt();
switch (rc) {    
    case 1:
        System.out.println("You're now a human.");
    
        break;
        case 2:
            System.out.println("You're now a Hill Dwarf.");
            break;
        case 3:
            System.out.println("You're now a Mountain Dwarf.");
            break;
        case 4:
            System.out.println("You're now a High Elf.");
            break;
        case 5:
            System.out.println("You're now a Wood Elf.");
            break;
        case 6:
            System.out.println("You're now a Dark Elf (Drow).");
            break;
        case 7:
            System.out.println("You're now a Tiefling.");
            break;
}
   System.out.println("Choose your class");  
           System.out.println("Barbarian: Fierce Warrior with primitive background. Can enter a battle rage. Hit die: 1d12, Primary Ability: Strength, Saving Throw proficiencies: Strength + Constitution, Armor and Weapon proficiencies: Light/medium armor, shields, simple/martial weapons ==1");
        System.out.println("Bard: Inspiring Magician whose power echoes the music of creation. Hit die: 1d8, Primary Ability: Charisma, Saving Throw proficiencies: Dexterity + Charisma, Armor and Weapon proficiencies: Light armor, simple weapons, hand crossbows, long/shortswords, rapiers ==2"); 
System.out.println("Cleric: Priestly champion who wields divine magic in service of a higher power. Hit die: 1d8, Primary Abilities: Wisdom, Saving Throw proficiencies: Wisdom + Charisma, Armor and Weapon proficiencies: Light/medium armor, shields, simple Weapons ==3");
System.out.println("Druid: Priest of Old faith wielding the powers of nature. Able to adopt animal forms. Hit die: 1d8, Primary Ability: Wisdom, Saving Throw proficiencies: Wisdom + Intelligence, Armor and Weapon proficiencies: nonmetal light/medium armor, nonmetal shields, clubs, daggers, darts, javelins, maces, quarterstaffs, scimitars, sickles, slings, spears ==4");
System.out.println("Fighter: Master of martial combats and skilled with many weapons and armor. Hit die: 1d10, Primary Ability: Strength or Dexterity, Saving Throw proficiencies: Strength + Constitution, Armor and Weapon proficiencies: All armor, shields, simple/martial weapons ==5");
System.out.println("Dark Elf (Drow): Following a path of evil and corruption. +2 in dexterity +1 in charisma. Speed: 30ft, Size: Medium, type: Humanoid, Languages: Common + Elvish, Darkvision: up to 120ft, Traits: Fey Ancestry, Keen Senses, Trance, Drow weapon Training, Sunlight sensitivity, Drow magic ==6");
System.out.println("Tiefling: +2 in Charisma +1 in intelligence. Speed: 30ft, Size: Medium, type: Humanoid, Languages: Common + Infernal, Darkvision: up to 60ft, Traits: Hellish resistance, Infernal Legacy ==7");
Scanner sc3 = new Scanner(System.in);
int clss = sc3.nextInt();
switch (clss) {    
    case 1:
        System.out.println("You're now a human.");
    
        break;
        case 2:
            System.out.println("You're now a Hill Dwarf.");
            break;
        case 3:
            System.out.println("You're now a Mountain Dwarf.");
            break;
        case 4:
            System.out.println("You're now a High Elf.");
            break;
        case 5:
            System.out.println("You're now a Wood Elf.");
            break;
        case 6:
            System.out.println("You're now a Dark Elf (Drow).");
            break;
        case 7:
            System.out.println("You're now a Tiefling.");
            break;
}
while (a == false) {
            
        
        Scanner sc = new Scanner(System.in);
System.out.println("Finally, enter your new name");
String name = sc.nextLine();
System.out.println(name + ". Is that right?");
}
    }




}