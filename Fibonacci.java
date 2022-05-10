import java.util.Scanner;


public class Fibonacci
{
  public static void main(String[] args)
  {
   	  
   Scanner number = new Scanner(System.in);
   int n;

   System.out.print("Type a number: ");
   n = number.nextInt();

   int[] fibo = new int[n+ 1];

   for(int i = 0; i < fibo.length; i++) 
    {
     if (i == 0)
     {
      fibo[i] = 0;
     }else if (i == 1){
      fibo[i] = 1;
     }else{
     fibo[i] = fibo[i-1] + fibo[i - 2];
     }

    }
    
   // Print all the sequence of the Fibonacci Sequence until the number typing
   for(int k = 0; k < fibo.length; k++)
    System.out.println(fibo[k]);	   
   
  }	   
}	  


