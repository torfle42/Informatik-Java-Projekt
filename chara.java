import java.util.Scanner;

public class chara{
    public static void character (){
        boolean a = false;
        
int[] abilityScores = new int[6];
//I have no idea how to calculate this
int hpmax = 0;
        
//race selection, no button/list
    String HumanDescript="Humans are adaptive and innovative. They gain +1 to all ability scores. and have a base movement speed of 30ft.(9,144m). They are of medium size and are classified as humanoids. They can speak, read, and write Common and one extra language of their choice. Humans do not have any special traits.";
    String HillDwarfDescript="Hill Dwarves have keen senses, deep intuition, and remarkable resilience. They gain +2 to Constitution and +1 to Wisdom. Their hit point maximum increases by 1 every level. They have a base movement speed of 25ft.(7,620m). They are of medium size and are classified as humanoids. They can speak, read, and write Common and Dwarvish. They have Darkvision up to 60ft.(18,288m) and possess the traits Dwarven Resilience, Dwarven Combat Training, Tool Proficiency, and Stonecunning.";
    String MountainDwarfDescript="Mountain Dwarves are strong and hardy, accustomed to a difficult terrain. They gain +2 to Constitution and +2 to Strength. They have a base movement speed of 25ft.(7,620m). They are of medium size and are classified as humanoids. They can speak, read, and write Common and Dwarvish. They have Darkvision up to 60ft.(18,288m) and possess the traits Dwarven Resilience, Dwarven Combat Training, Tool Proficiency, Stonecunning, and Dwarven Toughness.";
    String HighElfDescript="High Elves have a keen mind and a mastery of basic magic. They gain +2 to Dexterity and +1 to Intelligence. They have a base movement speed of 30ft.(9,144m). They are of medium size and are classified as humanoids. They can speak, read, and write Common, Elvish, and one extra language of their choice. They have Darkvision up to 60ft.(18,288m) and possess the traits Fey Ancestry, Keen Senses, Trance, Elf Weapon Training, and cantrip.";
    String WoodElfDescript="Wood Elves have keen senses and intuition, and are very quick and stealthy in their native forests. They gain +2 to Dexterity and +1 to Wisdom. They have a base movement speed of 35ft.(10,668m). They are of medium size and are classified as humanoids. They can speak, read, and write Common and Elvish. They have Darkvision up to 60ft.(18,288m) and possess the traits Fey Ancestry, Keen Senses, Trance, Elf Weapon Training, and Mask of the Wild.";
    String DarkElfDescript="Dark Elves, also known as Drow, follow a path of evil and corruption. They gain +2 to Dexterity and +1 to Charisma. They have a base movement speed of 30ft.(9,144m). They are of medium size and are classified as humanoids. They can speak, read, and write Common and Elvish. They have Darkvision up to 120ft.(36,576m) and possess the traits Fey Ancestry, Keen Senses, Trance, Drow Weapon Training, Sunlight Sensitivity, and Drow Magic.";
    String TieflingDescript="Tieflings gain +2 to Charisma and +1 to Intelligence. They have a base movement speed of 30ft.(9,144m). They are of medium size and are classified as humanoids. They can speak, read, and write Common and Infernal. They have Darkvision up to 60ft.(18,288m) and possess the traits Hellish Resistance and Infernal Legacy.";
Scanner sc2 = new Scanner(System.in);
int rc = sc2.nextInt();
String rac = null;
switch (rc) {    
    case 1:
        rac = "Human";
        System.out.println("You're now a human.");
    abilityScores[0] = 1;
    abilityScores[1] = 1;
    abilityScores[2] = 1;
    abilityScores[3] = 1;
    abilityScores[4] = 1;
    abilityScores[5] = 1;
        break;
        case 2:
            rac = "Hill Dwarf";
            System.out.println("You're now a Hill Dwarf.");
            abilityScores[2] = 2;
            abilityScores[4] = 1;
            hpmax = 1;
            break;
        case 3:
            rac = "Mountain Dwarf";
            System.out.println("You're now a Mountain Dwarf.");
            abilityScores[0] = 2;
            abilityScores[2] = 2;
            break;
        case 4:
            rac = "High Elf";
            System.out.println("You're now a High Elf.");
            abilityScores[1] = 2;
            abilityScores[3] = 1;
            break;
        case 5:
            rac = "Wood Elf";
            System.out.println("You're now a Wood Elf.");
            abilityScores[1] = 2;
            abilityScores[4] = 1;
            break;
        case 6:
            rac = "Dark Elf (Drow)";
            System.out.println("You're now a Dark Elf (Drow).");
            abilityScores[1] = 2;
            abilityScores[5] = 1;
            break;
        case 7:
            rac = "Tiefling";
            System.out.println("You're now a Tiefling.");
            abilityScores[5] = 2;
            abilityScores[3] = 1;
            break;

            //class without a button/list
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
String charclass = null;
switch (clss) {    
    case 1:
        charclass = "Barbarian";
        System.out.println("You're now a Barbarian.");
    
        break;

        case 2:
            charclass = "Bard";
            System.out.println("You're now a Bard.");
            break;
        case 3:
            charclass = "Cleric";
            System.out.println("You're now a Cleric.");
            break;
        case 4:
            charclass = "Druid";
            System.out.println("You're now a Druid.");
            break;
        case 5:
            charclass = "Fighter";
            System.out.println("You're now a Fighter.");
            break;
        case 6:
            charclass = "Monk";
            System.out.println("You're now a Monk.");
            break;
        case 7:
            charclass = "Paladin";
            System.out.println("You're now a Paladin.");
            break;
        case 8:
            charclass = "Ranger";
            System.out.println("You're now a Ranger.");
            break;
        case 9:
            charclass = "Rogue";
            System.out.println("You're now a Rogue.");
            break;
        case 10:
            charclass = "Sourcerer";
            System.out.println("You're now a Sourcerer.");
            break;
        case 11:
            charclass = "Warlock";
            System.out.println("You're now a Warlock.");
            break;
        case 12:
            charclass = "Wizard";
            System.out.println("You're now a Wizard.");
            break;
}

//Ability Scores

System.out.println("The stats for your character are randomly determined.");
int str = rng();
System.out.println("Strength: " + str + " + " + abilityScores[0]);
int dex = rng();
System.out.println("Dexterity: " + dex + " + " + abilityScores[1]);
int con = rng();
System.out.println("Constitution: " + con + " + " + abilityScores[2]);
int intel = rng();
System.out.println("Intelligence: " + intel + " + " + abilityScores[3]);
int wis = rng();
System.out.println("Wisdom: " + wis + " + " + abilityScores[4]);
int chr = rng();
System.out.println("Charisma: " + chr + " + " + abilityScores[5]);
str += abilityScores[0];
dex += abilityScores[1];
con += abilityScores[2];
intel += abilityScores[3];
wis += abilityScores[4];
chr += abilityScores[5];

//Name (Not completed because I have no UI button)
String char_name=null;
while (a == false) {
            
        
        Scanner sc = new Scanner(System.in);
System.out.println("Finally, enter your new name");
char_name = sc.nextLine();
System.out.println(char_name + ". Is that right?");
}

//Final character sheet
String CharSheetTitle="--- Character Sheet ---";
String CharSheetName="Name: "+char_name;
String CharSheetRac="Species: "+rac;
String CharSheetClass="Class: "+charclass;
String CharSheetAbilities="--- Abilities ---";
String CharSheetStr="Strength: "+str;
String CharSheetDex="Dexterity: "+dex;
String CharSheetCon="Constitution: "+con;
String CharSheetIntel="Intelligence: "+intel;
String CharSheetWis="Wisdom: "+wis;
String CharSheetChr="Charisma: "+chr;
String CharSheethpmax="Hit Point Maximum: "+hpmax;
    }

    public static int rng(){
        //random rolls for stats
        int total = 0;
        int[] rolls = new int[4];
        for (int i = 0; i < 4; i++){
            rolls[i] = (int)(Math.random() * 6) + 1;
        }
        int min = rolls[0];
        for (int i = 1; i < 4; i++){
            if (rolls[i] < min){
                min = rolls[i];
            }
        }
        for (int i = 0; i < 4; i++){
            total += rolls[i];
        }
        total -= min;
        return total;
    }



}