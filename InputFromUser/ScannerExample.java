import java.util.Scanner;
 
// Driver Class
public class ScannerExample
 {
      
    public static void main(String[] args)
    {
  
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your name");
        String name = sc.nextLine(); //Saloni Jain
        String name1 = sc.next(); //Saloni
        System.out.println("your name is :"+name);

        System.out.println("enter your age ");
        int age = sc.nextInt();
        System.out.println("your age is :"+age);

        System.out.println("enter your gender");
        char gender = sc.next().charAt(0);  //female
        System.out.println("your gender is :"+gender);

 
        
    
}
 }