import java.util.Scanner;

public class chara{
    public static void character (){
        boolean a = false;
        int stats[] = new int[7];
        
        int indstts[] = new int[7];
        

        
        System.out.println("Choose your class");
        System.out.println("Warrior: High strength and endurance, low agility and luck. Strong kill. But sword kills better. ==1");
        System.out.println("Mage: High Intelligence and perception, low strength and endurance. Has read every book there is and then some. ==2"); 
System.out.println("Thief: High agility and charisma, low endurance and intelligence. A smile can get you somewhere. Even if that somewhere is in someone elses pocket. ==3");
System.out.println("Ranger: High charisma and luck, low agility and strength. Not the ranger everyone expects but sheep are more fun than bows. Right? ==4");
System.out.println("Gambler: Highest Luck everything else average. Bet everything on red boiiiiiiiiiiiiiii. ==5");
System.out.println("Idiot: Lowest Intelligence, perception and charisma. But highest stregth, agility, and endurance. Who let this idiot in here??? ==6");
Scanner sc2 = new Scanner(System.in);
int clss = sc2.nextInt();
switch (clss) {    
    case 1:
        System.out.println("You're now a warrior.");
        int clssstts[] = {3,1,3,1,1,-3,-3};
        break;
        case 2:
            System.out.println("You're now a mage.");
            int clssstts[] = {-3,3,-3,1,3,1,1};
            break;
        case 3:
            System.out.println("You're now a thief.");
            int clssstts[] = {1,1,-3,3,-3,3,1};
            break;
        case 4:
            System.out.println("You're now a ranger.");
            int clssstts[] = {-3,1,1,3,1,-3,3};
            break;
        case 5:
            System.out.println("You're now a gambler.");
            int clssstts[] = {1,1,1,1,1,1,7};
            break;
        case 6:
            System.out.println("You're now an idiot.");
            int clssstts[] = {5,-5,5,-5,-5,5,1};
            break;
}
    
while (a == false) {
            
        
        Scanner sc = new Scanner(System.in);
System.out.println("Finally, enter your new name");
String name = sc.nextLine();
System.out.println(name + ". Is that right?");
}
    }



public static int stat (int clss , int base){
int stat = clss + base + 1;
return stat;
}
}