package test;



import lombok.extern.java.Log;

import java.util.*;

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
//        Random random = new Random();
//        System.out.println(random.nextInt(5));
//        System.out.println();
        List<Integer> res = new ArrayList<>();
        Integer[] te = {1,5,8,9,5};
        List list = Arrays.asList(te);
        System.out.println(list.size());
        for(Object i : list) {
            System.out.println(i + "-");
        }
        System.out.println(Double.compare(2,5));
        Map<Integer, Integer> map = new HashMap();

        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if(classStringArrayList.equals(classIntegerArrayList)){
            System.out.println("泛型测试"+"类型相同");
        }
    }
}


