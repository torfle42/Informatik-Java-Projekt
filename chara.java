import java.util.Scanner;

public class chara{
    public static void character (){
        boolean a = false;
        while (a == false) {
            
        
        Scanner sc = new Scanner(System.in);
System.out.println("Enter your new name");
String name = sc.nextLine();
System.out.println(name + ". Is that right?");

        }
    }


public static int stat (int clss ; int base){
int stat = clss + base + 1;
return stat;
}
}