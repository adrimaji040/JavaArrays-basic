package com.adri.array;

import java.util.Scanner;
import java.util.ArrayList;

public class asteriskArray
{
  public static void main(String[] args)
  {

    //input for console	  
    //int[] ArrayS = {1,2,3,4};

    ArrayList<String> months = new ArrayList<String>();
    String value;
    System.out.println("Type a number: ");
    Scanner as  = new Scanner(System.in);
    int n = as.nextInt();

     //Create Array
    int[] ArrayS = new int[n];
    int space = ArrayS.length;     
    int x = 1;


    for(int j = 0; j < ArrayS.length; j++)
    {
	    
      ArrayS[j] = x;
      value = "May - " + String.valueOf(j + 1);
      months.add(value);
      x++;
     }

   	    
    //itered array
    for(int i = 0; i < ArrayS.length; i++)
    {
                 
      System.out.printf("%" + space + "s"," ");
      space--;
      for(int k = 0; k < ArrayS[i]; k++)
	      
        System.out.printf("%s","x");
        System.out.printf("%n");
	
    }

    //Itered ArrayList
    for(String m : months)
    { 
     System.out.println(m);	    


    }
        
  }

}
