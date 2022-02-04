public class Main{
    public static void main (String args[])
    {
        long abc= 5600000000; // 8 byte -> 64 bits 
        int a=560000; // 4 byte -> 32 bits
        short b= 56 ; // 2 byte -> 16 bits
        byte c= 5; // 1 byte ->  8 bits
        char d ='A'; 
        char c= 66; // on printing the value of c here we will get the ascii value 
      
       
        System.out.print(a+"\n");
        float percent1= 5.5f; // 4 byte -> 32 bits 
        double percent =5.5; // 8 byte -> 64 bits
        System.out.print(percent+"\n");
        System.out.print(percent1);
        
        double d1= 5; // implicit conversion // we can store int value in double 
        int k =int (5.5); // explicit type conversion
        
    }
}
