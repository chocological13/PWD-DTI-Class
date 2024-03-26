import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.Iterable;

public class LoopStatement {

    public static void main(String[] args) {
        int loopCount = 5;
        for (int iterator = 0; iterator < loopCount; iterator++) {
            System.out.println("Iteration Number: " + (iterator + 1));
        }

        System.out.println(" ");

        // Pre / Post increment
        int numberA = 5;
        int numberB = 5;
        int resultPre = ++numberA; // 5 + 1 -> resultPre
        int resultPost = numberB++; // 5 -> resultPost -> 5 + 1
        System.out.println(resultPre);
        System.out.println(resultPost);
        System.out.println(numberB);

        // For-Each Loop
//        for (type var : array) {
//            //statement
//        }

//        List numbers = Arrays.asList{1, 2, 3, 4, 5};
//        for (Integer num : numbers) {
//            System.out.println(num);
//        }

        String name = "firstName lastName";
        String[] nameSplit = name.split(" ");

        for (String item : nameSplit) {
            System.out.println(item); // the word 'item' is depending on us, it's just for readability
        }

        for (int i = 0; i < nameSplit.length; i++) {
            System.out.println(nameSplit[i]);
        }
    }
}
