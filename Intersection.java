public class Intersection
{
   public static void main(String[] args)
   {
    
     int[] arrayA = {23,24,25,26,27,28,29,30,31,32};
     int[] arrayB = {19,20,22,24,26,28};

     int[] arrayC = new int[6];
     int n = 0;

     for(int i = 0; i < arrayA.length; i++)
     {
	for(int j = 0; j < arrayB.length; j++)
	{
	   if (arrayA[i] == arrayB[j])
           {
	    arrayC[n] = arrayA[i];
	    n++;
	   }		   
	}
     }
     //print Arrays
     //ArrayA
     System.out.printf("%s", "ArrayA = ");
    for(int counter = 0; counter < arrayA.length; counter++)
     System.out.printf("%d" + ',', arrayA[counter]); 
     System.out.printf("%n"); 
     

    //print Arrays
     //ArrayB
    System.out.printf("%s", "ArrayB = ");
    for(int counter = 0; counter < arrayB.length; counter++)
     System.out.printf("%d" + ',', arrayB[counter]);
     System.out.printf("%n");

   //ArrayC
   System.out.printf("%s", "ArrayC = ");
    for(int counter = 0; counter < arrayC.length; counter++)
     System.out.printf("%d" + ',' ,  arrayC[counter]);
     

   }

}

