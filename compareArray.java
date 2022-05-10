public class compareArray
{
  public static void main(String[] args)
  {
    int[] arrayA = {23,24,25,26,27,28,29,30,31,32};
    int[] arrayB = {19,20,22,24,26,28};
    int[] arrayNew = new int[6];
    int d = 0;   

    for(int counter = 0; counter < arrayA.length; counter++)
     {
	 for(int i = 0; i < arrayB.length; i++)
         {
	   if (arrayA[counter] == arrayB[i])
           {
              arrayNew[d] = arrayA[counter];
	      d+=1;
	   }
	 }

     }

    //print arrayA
    System.out.printf("%s%n", "Array A");	 
    for(int s = 0; s < arrayA.length; s++)
    {
      
     System.out.printf("%d%n", arrayA[s]);	    
    }

    //Array B
    System.out.printf("%s%n", "Array B");
    for(int x = 0; x < arrayB.length; x++)
    { 
      System.out.printf("%d%n", arrayB[x]);
    }

     // print the common number
     System.out.printf("%s%n", "Common Array");
     for(int k = 0; k < arrayNew.length; k++)
      {
         System.out.printf("%d%n", arrayNew[k]);	      
      }
  }

}	
