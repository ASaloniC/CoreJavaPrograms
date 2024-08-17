public class StaticVariable {

    //Define Static Variables
    static int i = 50;
    static int j = 25;
    static int subtract;
    static int k;   //Have a default value
    static public int l=80; //  Access Specifiers can be used.


    // We can access Static  Variables directly from non-static methods.
     public void subtraction()
    {
      subtract =i-j;
      System.out.println(subtract);
    }

    public static void main(String[] args) {


        StaticVariable sv = new StaticVariable();
        sv.subtraction();

        
       //System.out.println(i); //We can access static variable directly.
       //System.out.println(sv.i);  //We can access static variable through object.
       //System.out.println(StaticVariable.i);  //We can access static variable through class name.

       //System.out.println(k); //Have a default value.
    
}
}
