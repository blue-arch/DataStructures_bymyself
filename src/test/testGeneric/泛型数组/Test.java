package test.testGeneric.泛型数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Blue
 * @Date: 2021/7/14
 * @Time: 15:54
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
//        List<String>[] lsa = new List<String>[10]; // Not really allowed.
//        Object o = lsa;
//        Object[] oa = (Object[]) o;
//        List<Integer> li = new ArrayList<Integer>();
//        li.add(new Integer(3));
//        oa[1] = li; // Unsound, but passes run time store check
//        String s = lsa[1].get(0); // Run-time error: ClassCastException.
        List<?>[] lsa = new List<?>[10]; // OK, array of unbounded wildcard type.
        Object o = lsa;
        Object[] oa = (Object[]) o;
        List<Integer> li = new ArrayList<Integer>();
        li.add(new Integer(3));
        oa[1] = li; // Correct.
        Integer i = (Integer) lsa[1].get(0); // OK
    }
}
