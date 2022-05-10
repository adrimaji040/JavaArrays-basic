import java.util.ArrayList;

public class myArrayList
{

  public static void main(String[] args)

  {

    ArrayList<String> colors = new ArrayList<String>();

    colors.add("red");
    colors.add(1,"blue");
    colors.add("yellow");

    //read all elements 

    for(int i=0; i < colors.size(); i++)
    System.out.printf(" %s ", colors.get(i));

    //Show if an element exist into the arraylist
    System.out.printf("\" green\" is %s in the list %n", colors.contains("green") ? "": "not ");


    //print size of ArrayList colors
    System.out.printf(" Size: %s%n ", colors.size());




  }

}
