import java.util.ArrayList;
public class ArrayListExample {
    
    public static void main(String args[]) {
        ArrayList list=new ArrayList(); //ArrayList with out any specific data type
        list.add(10);
        list.add("Sivaram");
        list.add(155.5);
        list.add("welcome");
        System.out.println(list);
        System.out.println(list.size());//printing size of arraylist
        System.out.println(list.get(1));
        list.add(2,"Salivahan");//inserting values in between
        System.out.println(list);
        list.remove(3);//removing a specific value from Arraylist
        System.out.println(list);
        //printing all elements from list
        //method 1
        for(Object i:list) //here Object is root Class in java where all the classes comes under it
        {
            System.out.println(i);
        }
        //method 2 
        System.out.println("----------Using lambda and ForEach function--------");
        list.forEach(n->System.out.println(n));//using forEach function
        System.out.println("---------Using Method Interface---------");
        list.forEach(System.out::println);//using method interface in ForEach 



        
    }
    
}
