import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyClass {
    public static void main(String args[]) {
        // Creating an object of List Object
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        try {
            // Printing the elements of the List
            System.out.println("List: ");

            Iterator<Integer> it = list.iterator();

            while (it.hasNext()) {
                int ele = it.next();
                System.out.print(ele + ", ");

                // ConcurrentModificationException
                // is raised here as an element
                // is removed during the iteration
                if (ele == 4) {
                    System.out.println("\n\nTrying to remove an element in between of the iteration\n");
                    list.remove(ele);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}