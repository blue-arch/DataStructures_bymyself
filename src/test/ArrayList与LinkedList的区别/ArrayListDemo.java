package test.ArrayList与LinkedList的区别;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Blue
 * @Date: 2021/7/20
 * @Time: 17:01
 * @Description:
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> userlist = new ArrayList<String>();
        userlist.add("yulon");
        userlist.add("xiaoyun");
        userlist.add("羽龙共舞");
        System.out.println("使用普通for循环:");
        for(int i=0; i<userlist.size(); i++){
            System.out.print(userlist.get(i)+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("使用Iterator迭代器:");
        Iterator it = userlist.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("使用增强for循环:");

        for(String s : userlist){
            System.out.print(s+" ");
        }
    }
}