package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @Author: Blue
 * @Date: 2021/6/3
 * @Time: 16:00
 * @Description:
 */
public class TestNew {
    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < random.nextInt(10) + 2; ++i) {
            res.add(random.nextInt(20));
        }

        for(int ch : res) {
            System.out.print(ch + " ");
        }
        System.out.println();

        te(res);
        for(int ch : res) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println((double)2);


    }

    public static void te(ArrayList<Integer> res) {
        ArrayList<Integer> res2 = new ArrayList<>(res);
        res2.remove(2);
        res.remove(2);
    }

}
