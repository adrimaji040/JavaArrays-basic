public class InitArray
{
  public static void main(String[] args)
  {
    int[] array = new int[15];
    System.out.printf("Hello %s!%n", "World");
    System.out.printf("The number is: %7.3f and %10.2f%n", 589.3354577 , 698774.125689);
    System.out.printf("%s%8s%n", "Index", "Value");
    for(int counter = 0; counter < array.length; counter++)
	System.out.printf("%5d%8d%n", counter, array[counter]);    
   }	  
}	

