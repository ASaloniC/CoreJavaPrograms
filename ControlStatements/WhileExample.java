 class WhileExample {

    public static void main(String[] args) {
        
        /* 
        int i=1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
        */

        int number = 12345; 
        int reverse = 0;  

        while(number != 0)   
        {  
        int remainder = number % 10;  
        reverse = reverse * 10 + remainder;  
        number = number/10;  
        }  
        System.out.println("The reverse of the given number is: " + reverse);  
        
    }
    
}
