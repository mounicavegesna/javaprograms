public class Swap
{
    
   public static void main(String[] args) 
   {
      int a = 30;
      int b = 45;
      System.out.println("Before swapping, a = " + a + " and b = " + b);

      swapFunction(a, b);
      
   }
   public static void swapFunction(int a, int b)
   {
     
      int c = a;
      a = b;
      b = c;
      System.out.println("After swapping a = " + a + " b = " + b);
   }
}