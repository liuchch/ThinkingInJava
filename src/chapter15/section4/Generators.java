package chapter15.section4;

import chapter15.section3.Coffee;
import chapter15.section3.CoffeeGenerator;
import chapter15.section3.Generator;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll,
                                         Generator<T> gen, int n) {
        for (int i=0; i<n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }
    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<Coffee>(),
                new CoffeeGenerator(), 4);
        for (Coffee c : coffee) {
            System.out.println(c);
        }

    }
}
