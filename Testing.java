import java.util.ArrayList;
import java.util.List;
class Testing
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        Greet g1=(s)->System.out.println("Hello " + s);
        g1.greeting("Sivaram ");
        List<Integer> number=new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.forEach(System.out::println);

    }

   
}