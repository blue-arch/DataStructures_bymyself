package test.testHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Blue
 * @Date: 2021/7/14
 * @Time: 22:04
 * @Description:
 */
public class TestHashMap {


    public static void main(String[] args) {
        Map<Integer, Integer> res = new HashMap<>();
        System.out.println(roundUpToPowerOf2(62));
    }

    public static int roundUpToPowerOf2(int number) {
        return (number > 1) ? Integer.highestOneBit((number - 1) << 1) : 1;
    }

}
