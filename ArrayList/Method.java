import java.util.ArrayList;
import java.util.List;

public class Method {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        List<String> vegetables = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Fruits = " + fruits);
        System.out.println("Size of Fruits  = " + fruits.size());

        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Carrot");
        vegetables.add("Raddish");

        System.out.println("vegetables = " + vegetables);

        fruits.addAll(vegetables);

        System.out.println("Fruits After AddAll(vegetables) = " + fruits);

        System.out.println("Size of Fruits After AddAll(vegetables) = " + fruits.size());

        System.out.println("Fruits at index 1  = " + fruits.get(1));

        System.out.println("Change Fruits at index 1");
        fruits.set(1, "Banana");
        System.out.println("Fruits = " + fruits);

        fruits.remove(0);
        System.out.println("Fruits after remove fruits at index 0= " + fruits);

        fruits.removeAll(vegetables);
        System.out.println("Fruits after removeAll vegetable= " + fruits);

        System.out.println("fruits.contains('Banana') = " + fruits.contains("Banana"));
        System.out.println("fruits.isEmpty = " + fruits.isEmpty());
        System.out.println("Converting ArrayList to Array");
        String temp[] = new String[fruits.size()];
        fruits.toArray(temp);

        for (String e : temp) {
            System.out.println(e);
        }

    }
}
