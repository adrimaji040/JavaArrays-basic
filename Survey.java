public class Survey
{
   public static void main(String[] args)
   {
     int[] response = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
     int[] frecuency = new int[7];

     for(int i = 0; i < response.length; i++)
     {

     try
     {
      ++frecuency[response[i]];	     
     }
     catch (ArrayIndexOutOfBoundsException e)
     {
      System.out.println(e);
      System.out.printf(" response[%d] = %d%n%n", i, response[i]);
     }

    }

    System.out.printf("%s%10s%n", "Ranting", "Frecuency");

     for(int r = 0; r < frecuency.length; r++)
     {
      System.out.printf("%6d%10d%n", r, frecuency[r]);
     }

   }
}
