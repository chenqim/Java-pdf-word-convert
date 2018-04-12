import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

    private static final int number = 500000;

    public static void main(String[] args) {

        Object object = new Object();

        // List<Object> list = new ArrayList<>();
        List<Object> list = new LinkedList<>();
        long time = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            list.add(object);
        }
        System.out.println("time: " + (System.currentTimeMillis() - time));

    }

}
