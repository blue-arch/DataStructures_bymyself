package test.testHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args){
        Day day1 = new Day(1, 2, 3);
        Day day2 = new Day(2, 3, 4);
        Map<String,Day> map = new HashMap<String,Day>();
        //成对放入key-value对
        map.put("第一个", day1);
        map.put("第二个", day2);
        //判断是否包含指定的key
        System.out.println(map.containsKey("第一个"));
        System.out.println(map.get("etre") + "***************");
        //判断是否包含指定的value
        System.out.println(map.containsValue(day1));
        //循环遍历
        //1.获得Map中所有key组成的set集合
        Set<String> keySet = map.keySet();
        //2.使用foreach进行遍历
        for (String key : keySet) {
            //根据key获得指定的value
            System.out.println(map.get(key));
        }
        //根据key来移除key-value对
        map.remove("第一个");
        System.out.println(map);
    }

}
