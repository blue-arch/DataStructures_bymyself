package test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Test02 {
//    public static void main(String[] args){
//        PriorityQueue<String> pq=new PriorityQueue<String>(10,new Comparator()   //定义一个匿名内部类
//        {
//            @Override
//            public int compare(Object obj1, Object obj2){
//                String s1=(String)obj1;
//                String s2=(String)obj2;
//                if(s1.length()==s2.length())
//                    return s1.compareTo(s2);
//                else if(s1.length()<s2.length())
//                    return -1;
//                else
//                    return 1;
//            }
//
//        });
//        pq.add("chensongxia");
//        pq.add("yuyue");
//        pq.offer("qiandanphjdhj");
//        pq.offer("chensongxib");
//        System.out.println(pq.poll());
//        for(String str:pq){
//            System.out.println(str);
//        }
//
//    }

    public static void main(String[] args) {
//        PriorityQueue<Integer> q=new PriorityQueue<Integer>((a,b)-> a - b);   //定义一个匿名内部类);
//        for(int i = 0; i < 15; i++) {
//            q.add(i);
//            if(q.size() > 5) {
//                q.poll();
//            }
//        }
//        System.out.println(q.peek());

        PriorityQueue<Integer> q =new PriorityQueue<>();
        for(int i = 0; i < 5; ++i) {
            q.add(i);
        }
        while(!q.isEmpty()) {
            System.out.print(q.poll() + "**");
        }

        Map<String, Double> map = new HashMap<>();
        for(int i = 0; i < 20; ++i) {
            map.put(i+"*", (double) i);
        }
        for(Map.Entry<String, Double> ch : map.entrySet()) {
            System.out.print(ch.getKey()+ "****"+ ch.getValue() + "  ");
        }
        for(Double ch : map.values()) {
            System.out.print(ch + "  ");
        }
        System.out.println();

        System.out.println(Math.ceil(10/12.5) + "**********");

        double h = 6.1e-12;
        System.out.println(h);
    }
}
