package chapter15.section4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericMethods {
    public <M, T1> void f(String x, T1 y, Double z) {
        System.out.println(x.getClass().getName());
        System.out.println(y.getClass().getName());
        System.out.println(z.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", 1, 1.0);

        Map<Integer, String> hashMap = new HashMap<>();
        List<String> list = new ArrayList<>();
//        gm.f(1);
//        gm.f(1.0);
//        gm.f(1.0F);
//        gm.f('c');
//        gm.f(gm);
    }
}
