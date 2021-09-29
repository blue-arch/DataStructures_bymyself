package test.TestArrayList;

import test.testHashMap.Day;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args){
        //创建集合，添加元素
        Collection<Day> days = new ArrayList<Day>();
        for(int i =0;i<10;i++){
            Day day = new Day(i,i*60,i*3600);
            days.add(day);
        }
        //获取days集合的迭代器
        Iterator<Day> iterator = days.iterator();
        while(iterator.hasNext()){//判断是否有下一个元素
            Day next = iterator.next();//取出该元素
            //逐个遍历，取得元素后进行后续操作
            System.out.println(days);
        }
//
//        ListIterator<Day> res = days.();

    }

}