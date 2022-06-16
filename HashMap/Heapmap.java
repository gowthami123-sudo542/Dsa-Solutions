import java.util.*;
public class HashMaps
{
    public static void main(String[] args)
    {


        HashMap<String,String> Captials=new HashMap();
        //Inserting the elements
        Captials.put("India","Delhi");
        Captials.put("England","London");
        Captials.put("USA","Washington DC");

        //Printing the elements
        System.out.println(Captials);

        //Accessing the elements

        System.out.println(Captials.get("England"));

        //Removing the elements from map
        Captials.remove("India");
        System.out.println(Captials);

        //Removing all elements from the hashmap

        Captials.clear();
        System.out.println(Captials);
        //Inserting the elements
        Captials.put("India","Delhi");
        Captials.put("England","London");
        Captials.put("USA","Washington DC");

        //Printing the elements
        System.out.println(Captials);

        //Checking the size of the map

        System.out.println(Captials.size());


        // Keyset method only for keys
        //for ..each loop
       System.out.println("");
        for(String i:Captials.keySet())
        {
            System.out.println(i);
        }
      // Only for values
        System.out.println("");
        for(String i:Captials.values())
        {
            System.out.println(i);
        }
       //whether key is there or not
        System.out.println(Captials.containsKey("USA"));
      //whether value is there or not
        System.out.println(Captials.containsValue("Washington DC"));
    }
}
