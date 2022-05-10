public class exercsArray
{
  public static void main(String[] args)
  { 
   
   int[] array1 = { 1,22,6,7,125,5,46,111,0 };
   int[] arrayOdds   = new int[10];
   int[] arrayEvens = new int [10];

   System.out.printf("%s%8s%n", "Index","Values");
    //print all arrays
   for (int i = 0 ; i < array1.length; i++)
   {
        System.out.printf("%5d%8d%n", i, array1[i]);
	if (array1[i]%2 == 0 )
	{
	 arrayEvens[i] = array1[i];	
	}else{
	arrayOdds[i] = array1[i];	
	}
   }
   //Prinf ArrayEvens
   System.out.printf("%s8s%n","index","ValueArrayevens");
   for (int counter = 0; counter < arrayEvens.length; counter++)
    {
      System.out.printf("%5d%8d%n",counter, arrayEvens[counter]);	    

    }
   //Prinf ArrayOdds
   System.out.printf("%s%8s%n", "Index", "ValueArrayOdds");
   for (int counter = 0; counter < arrayOdds.length; counter++)
    {
      System.out.printf("%5d%8d%n", counter, arrayOdds[counter]);	    

    }

  }

}	

