public class InstanceVariable {

    
    //Define Instance Variables
    int e =10;
    int f =20;
    int multiply;
    int g;  // Have a default value.
    public int h =90; // Access Specifiers can be used.



    // We can access Instance Variables directly from non-static methods.
    public void multiplication()
    {
      multiply = e*f;
      System.out.println(multiply);
    }

     public static void main(String[] args) {

        InstanceVariable iv = new InstanceVariable();
        iv.multiplication();


        //System.out.println(e); //We can't access Instance Variables directly from static methods.
        //System.out.println(iv.e); //access Instance Variables through object in static method.
        //System.out.println(iv.g); //Print Default value



     }

    
}
