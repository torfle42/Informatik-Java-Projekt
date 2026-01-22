import java.util.Scanner;

public class chara{
    public static void character (){
        boolean a = false;
        
int[] abilityScores = new int[6];
int hpmax = 0;
        
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
    abilityScores[0] = 1;
    abilityScores[1] = 1;
    abilityScores[2] = 1;
    abilityScores[3] = 1;
    abilityScores[4] = 1;
    abilityScores[5] = 1;
        break;
        case 2:
            System.out.println("You're now a Hill Dwarf.");
            abilityScores[2] = 2;
            abilityScores[4] = 1;
            hpmax = 1;
            break;
        case 3:
            System.out.println("You're now a Mountain Dwarf.");
            abilityScores[0] = 2;
            abilityScores[2] = 2;
            break;
        case 4:
            System.out.println("You're now a High Elf.");
            abilityScores[1] = 2;
            abilityScores[3] = 1;
            break;
        case 5:
            System.out.println("You're now a Wood Elf.");
            abilityScores[1] = 2;
            abilityScores[4] = 1;
            break;
        case 6:
            System.out.println("You're now a Dark Elf (Drow).");
            abilityScores[1] = 2;
            abilityScores[5] = 1;
            break;
        case 7:
            System.out.println("You're now a Tiefling.");
            abilityScores[5] = 2;
            abilityScores[3] = 1;
            break;
}
   System.out.println("Choose your class");  
           System.out.println("Barbarian: Fierce Warrior with primitive background. Can enter a battle rage. Hit die: 1d12, Primary Ability: Strength, Saving Throw proficiencies: Strength + Constitution, Armor and Weapon proficiencies: Light/medium armor, shields, simple/martial weapons ==1");
        System.out.println("Bard: Inspiring Magician whose power echoes the music of creation. Hit die: 1d8, Primary Ability: Charisma, Saving Throw proficiencies: Dexterity + Charisma, Armor and Weapon proficiencies: Light armor, simple weapons, hand crossbows, long/shortswords, rapiers ==2"); 
System.out.println("Cleric: Priestly champion who wields divine magic in service of a higher power. Hit die: 1d8, Primary Abilities: Wisdom, Saving Throw proficiencies: Wisdom + Charisma, Armor and Weapon proficiencies: Light/medium armor, shields, simple Weapons ==3");
System.out.println("Druid: Priest of Old faith wielding the powers of nature. Able to adopt animal forms. Hit die: 1d8, Primary Ability: Wisdom, Saving Throw proficiencies: Wisdom + Intelligence, Armor and Weapon proficiencies: nonmetal light/medium armor, nonmetal shields, clubs, daggers, darts, javelins, maces, quarterstaffs, scimitars, sickles, slings, spears ==4");
System.out.println("Fighter: Master of martial combats and skilled with many weapons and armor. Hit die: 1d10, Primary Ability: Strength or Dexterity, Saving Throw proficiencies: Strength + Constitution, Armor and Weapon proficiencies: All armor, shields, simple/martial weapons ==5");
System.out.println("Monk: Master of martial arts harnessing the power of the body for physical and spiritual perfection. Hit die: 1d8, Primary Ability: Dexterity + Wisdom, Saving Throw proficiencies: Strength + Dexterity, Armor and Weapon proficiencies: simple weapons, shortswords ==6");
System.out.println("Paladin: Holy Warrior bound to a sacred oath. Hit die: 1d10, primary Ability: Strength + Charisma, Saving Throw proficiencies: Wisdom + Charisma, Armor and Weapon proficiencies: All armor, shields, simple and martial weapons ==7");
System.out.println("Ranger: Warrior who uses martial prowess and nature magic. Hit die: 1d10, Primary Ability: Dexterity + Wisdom, Saving Throw proficiencies: Dexterity + Strength, Armor and Weapon proficiencies: Light/medium armor, shields, simple/martial weapons ==8");
System.out.println("Rogue: Scoundril utilizing stealth and trickery. Hit die: 1d8, Primary Ability: Dexterity, Saving Throw proficiencies: Dexterity + Intelligence, Armor and Weapon proficiencies: Light armor, simple weapons, hand crossbows, long/shortswords, rapiers ==9");
System.out.println("Sourcerer: Spellcaster who draws on magic from a gift or bloodline. Hit die: 1d6, Primary Ability: Charisma, Saving Throw proficiencies: Constitution + Charisma, Armor and Weapon proficiencies: Daggers, darts, slings, quarterstaffs, light crossbows ==10");
System.out.println("Warlock: Wielder of magic, that came from a bargain with an extraplanar entity. Hit die: 1d8, Primary Ability: Charisma, Saving Throw proficiencies: Wisdom + Charisma, Armor and Weapon proficiencies: Light armor, simple weapons ==11");
System.out.println("Wizard: Scholarly magic user, capable of manipulating the structures of reality. Hit die: 1d6, Primary Ability: Intelligence, Saving Throw proficiencies: Intelligence + Wisdom, Armor and Weapon proficiencies: Daggers, darts, slings, quarterstaffs, light crossbows ==12");
Scanner sc3 = new Scanner(System.in);
int clss = sc3.nextInt();
switch (clss) {    
    case 1:
        System.out.println("You're now a Barbarian.");
    
        break;
        case 2:
            System.out.println("You're now a Bard.");
            break;
        case 3:
            System.out.println("You're now a Cleric.");
            break;
        case 4:
            System.out.println("You're now a Druid.");
            break;
        case 5:
            System.out.println("You're now a Fighter.");
            break;
        case 6:
            System.out.println("You're now a Monk.");
            break;
        case 7:
            System.out.println("You're now a Paladin.");
            break;
        case 8:
            System.out.println("You're now a Ranger.");
            break;
        case 9:
            System.out.println("You're now a Rogue.");
            break;
        case 10:
            System.out.println("You're now a Sourcerer.");
            break;
        case 11:
            System.out.println("You're now a Warlock.");
            break;
        case 12:
            System.out.println("You're now a Wizard.");
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