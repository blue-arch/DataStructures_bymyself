import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test03 {
    public static void main(String[] args) {
//        String a = "fwkfwlfk";
//        //System.out.println(a.trim());
//        System.out.println(a.substring(0,1));
//        char b = 'z';
//        System.out.println(a+b);
//        String s = "a good   example";
//        String[] t = s.split(" ");
//
//        System.out.println(Arrays.toString(t));
//        char a = 'a';
//        char b = 'a';
        //System.out.println(a==b);
//        System.out.println("ada".toCharArray());
//        System.out.println((char)(1+'a'));
        System.out.println(firstUniqChar2("leetcode"));

    }
    public static char firstUniqChar(String s){
        if(s==null||s.length()==0) {
            return ' ';
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(int i=0;i<s.length();i++){
           if(map.get(s.charAt(i))==1){
               return s.charAt(i);
           }
        }
        return ' ';
    }
    public static char firstUniqChar2(String s){
        Map<Character, Boolean> dic = new HashMap<>();

        char[] array = s.toCharArray();

        for (char c : array) {
            dic.put(c, !dic.containsKey(c));
        }

        for (char c : array) {
            if (dic.get(c)) return c;
        }

        return ' ';
    }

}
