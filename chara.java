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
    
while (a == false) {
            
        
        Scanner sc = new Scanner(System.in);
System.out.println("Finally, enter your new name");
String name = sc.nextLine();
System.out.println(name + ". Is that right?");
}
    }




}