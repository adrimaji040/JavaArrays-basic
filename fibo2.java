import java.util.Scanner;


public class fibo2
{

 public static void main(String[] args){
  int x = 5;
  int[] fi = new int[x + 1];
  int[] ArraySerie = new int[x+1];
  int n = 0;
  int size = x + 1;

  //Fill array from 0.... x 
  for(int i = 0; i < size; i++){
   fi[i] = n;
   n+=1; 
  }

  //from Array fi, calculate fibonnacci serie
  //itered and calculate each number

  for(int se=0; se < fi.length; se++){
    if(se == 0){
	ArraySerie[se] = 0;    
    }else if (se == 1){
       ArraySerie[se] = 1;
    }else{
     ArraySerie[se] = fi[se - 2] + fi[se - 1];

    }

  }

   // Itera Array fi
 
  for(int counter = 0; counter < fi.length; counter++)
  {
    System.out.printf("%5d,", fi[counter]);
    System.out.printf("%n");
  }

  //Read ArraySerie

 for(int counter = 0; counter < ArraySerie.length; counter++)
  {
    System.out.printf("%5d,", ArraySerie[counter]);
  }


 }

}





