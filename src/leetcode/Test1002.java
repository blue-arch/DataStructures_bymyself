package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test1002 {
    public static void main(String[] args) {
        String[] a = {"bella","label","roller","aertgre"};
        System.out.println(commonChars(a));
    }
    public static List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        int[] arr = new int[26];
        int[] res = new int[26];
        char[] tt;
        for(int i = 0;i<A.length;i++){
            int[] temp = new int[26];
            tt = A[i].toCharArray();
            for(int j =0;j<tt.length;j++){
                temp[tt[j]-'a']++;
                arr[tt[j]-'a']++;
                if(temp[tt[j]-'a']==1){
                    res[tt[j]-'a']++;
                }
            }
        }
        for(int m = 0;m<arr.length;m++){
            if(arr[m]==A.length&&res[m]==A.length){
                list.add(String.valueOf((char)('a'+m)));
            }else if(arr[m]>A.length&&res[m]==A.length){
                int a = arr[m]/A.length;
                while(a>0){
                    a--;
                    list.add(String.valueOf((char)('a'+m)));
                }
            }
        }
        return list;
    }

}
