import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String args[])
    {
        HashMap<Integer,String> hm=new HashMap<>();
        //HashMap<Integer,String> hm=new HashMap<Integer,String>() we can declare hashmap this way also
        //Adding values to the HasHmap
        hm.put(101,"Sivaram");
        hm.put(102,"Ram");
        hm.put(103, "salivahan");
        hm.put(104, "Ganesh");
        System.out.println(hm);
        //removing the values from map
        hm.remove(102);
        System.out.println(hm);
        //printing the specific value 
        System.out.println(hm.get(101));
        //Printing all values from Hashmap
        //method 1
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey() +  " " +m.getValue()) ;
        }
        //method 2
        System.out.println("----------Using forEach-----------");
        hm.forEach((k,v)->System.out.println(k+" " +v));
       

        
    }
    
}
