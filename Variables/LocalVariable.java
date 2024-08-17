public class LocalVariable {

 
     public void Addition()
    {
        // Define Local Variables
        int a =10;
        int b= 20;
        int add = a+b;
        System.out.println(add);


        // int c;  // Values Should be provided before use.
        //System.out.println(c);//Does not have any default values.
        
        // public int d =50; //Access Specifiers cannot be used.
        
       
    }
    public static void main(String[] args) {

        LocalVariable lvar = new LocalVariable();
        lvar.Addition(); //Method Called

       // System.out.println(a); //Local Variables can't accesed from outside
    }



    
}
