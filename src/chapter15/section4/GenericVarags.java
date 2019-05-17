package chapter15.section4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericVarags {

    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABKJGKJDGKJDGK".split(""));
        System.out.println(ls);
        ls = Arrays.asList("ABKJGKJDGKJDGK".split(""));
        System.out.println(ls);
    }

}
