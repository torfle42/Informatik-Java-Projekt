import java.util.Scanner;

public class chara{
    public static void character (){
        boolean a = false;
        

        
        System.out.println("Choose your race");
        System.out.println("Human: Very adaptive and innovative. +1 in two ability scores, one feat and one skill proficiency. Speed: 30ft, Size: Medium, type: Humanoid, Languages: Common + 1 other language, Traits: none ==1");
        System.out.println(" ==2"); 
System.out.println(" ==3");
System.out.println(" ==4");

Scanner sc2 = new Scanner(System.in);
int rc = sc2.nextInt();
switch (rc) {    
    case 1:
        System.out.println("You're now a human.");
    
        break;
        case 2:
            System.out.println("You're now a mage.");
            break;
        case 3:
            System.out.println("You're now a thief.");
            break;
        case 4:
            System.out.println("You're now a ranger.");
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