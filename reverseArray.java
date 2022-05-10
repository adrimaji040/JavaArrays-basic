public class reverseArray
{
  public static void main(String[] args)
  {
     String[] arraycolors = {"blue", "green", "yellow", "red"};
     String[] arrayReverse = new String[4];
     int j = 0;

     for(int counter = arraycolors.length - 1; counter >= 0; counter--)
     {
       arrayReverse[j] = arraycolors[counter];
       j+=1;

     }	    
     //Print the original array colors
     for(int f = 0; f < arraycolors.length; f++)
     {	     
      System.out.printf("%5s%n", arraycolors[f]);
     }

     //Print Reverse Array
      for(int h= 0; h < arrayReverse.length; h++)
     {	     
      System.out.printf("%5s%n", arrayReverse[h]);
     }

  }
}
