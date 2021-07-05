package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Author: Blue
 * @Date: 2021/6/16
 * @Time: 16:11
 * @Description:
 */
public class TestNew3 {
    public static void main(String[] args) {
//        Map<String, Double> map = new HashMap<>();
//        for(int i = 0; i <= 2; i++) {
//            for(int j= 0; j <= 2; ++j) {
//                String temp = i + "_" + j;
//                map.put(temp, map.getOrDefault(temp, 0.0) + 1);
//            }
//        }
//
//        for(int i = 0; i <= 2; i++) {
//            for(int j= 0; j <= 2; ++j) {
//                String temp = i + "_" + j;
//                map.put(temp, map.getOrDefault(temp, 0.0) + 1);
//            }
//        }
//
//        System.out.println(map.get("1_2"));
//        System.out.println(0.0 + 1);
//
//        System.out.println(1.0f / 2.0f);
//
//        float a = 1.0f;
//        float b = 2.0f;
//        System.out.println(a / b);
        Random random = new Random();
        System.out.println(random.nextInt(5));
        System.out.println();
    }
}
