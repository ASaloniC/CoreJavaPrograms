import java.util.*;
class ArrayExample2 {

    public static void main(String[] args) {
        /* Take a array values from user */
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter"+ n +"elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++)
        {

            System.out.println(arr[i]);
        }
        */

        /* copy of one array to second array{shallow copy} */
        //int arr2[] = arr;
            
        /* copy of one array to second array{deep copy} */
        
       // int arr2[] =arr.clone();
       // int arr2[] = Arrays.copyOf(arr,arr.length);
       // int arr2[] = Arrays.copyOfRange(arr,0,2);

       /* 
        arr2[0] =80;
        arr2[1]=90;
        */

        /* Print Original array */
        /* 
        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        */

        /* Print Copied array */
        /* 
        for(int i=0;i<arr2.length;i++)
        {

            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        */


     /* Find the last Occurrence of an element x in given array */

     /* 
     int arr[] = {5,4,3,5,5};
     int x=5;
     int lastIndex = -1;

    for(int i =0 ;i<arr.length;i++)
    {
       if(arr[i] == x)
       {
        lastIndex =i;
       
       }
    }
    System.out.println(lastIndex);
    */

    /* Find the First Occurrence of an element x in given array */

    /* 
     int arr[] = {5,4,3,5,5};
     int x=5;
     int FirstIndex = -1;

    for(int i =0 ;i<arr.length;i++)
    {
       if(arr[i] == x)
       {
        FirstIndex = i;
        break;
       
       }
    }
    System.out.println(FirstIndex);
    */

    /* How many times a given no is occurred */

    /* 
     int arr[] = {5,4,3,5,5};
     int x=5;
     int count =0

    for(int i =0 ;i<arr.length;i++)
    {
       if(arr[i] == x)
       {
       count++
       
       }
    }
    System.out.println(count);
    */   

    /* Sorted a array in asecending order */
    
    /*
     int[] arr = {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
     System.out.println("Array elements after sorting:");  

     for (int i = 0; i < arr.length; i++)   
     {  
       for (int j = i + 1; j < arr.length; j++)   
        {  
          int tmp = 0;  
          if (arr[i] > arr[j])   
          {  
             tmp = arr[i];  
             arr[i] = arr[j];  
             arr[j] = tmp;  
          }  
        }  
         System.out.println(arr[i]);  
      }  
     */
    }
    
}
