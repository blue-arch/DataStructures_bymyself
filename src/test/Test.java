package test;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.tree.TreeNode;
import java.math.BigInteger;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        //System.out.println(fuc(-2147483648));
//        int a = -2147483648;
//        System.out.println(-a);
//        long b= -a;
//        System.out.println(b);
//        System.out.println(Integer.parseInt("100"));
//        System.out.println(!("+".equals("+")));
//        int[] c = {2, 1};
//        int[] d = {2, 1};
//        System.out.println(c.equals(d));
//        int i = 9;
//        int[] arr = {1,2,3,4,5,6,7};
//        System.out.println(String.valueOf(arr).contains(String.valueOf(i)));
//        int b = 1;
//        int n =b;
//        System.out.println(b);
//        List<Integer> list = new ArrayList<Integer>();
//        Set<Integer> set = new HashSet<Integer>(new ArrayList<>());
//        Map<String,Integer> map = new HashMap<>();
//        map.put("fwff",2);
//        System.out.println(map.getOrDefault("fwff",0));
//        map.put("cur", map.getOrDefault("cur", 0)+1);
//        int[] arr = {};
//        System.out.println(arr.length);
//        System.out.println(Integer.MAX_VALUE);
//        Stack<Integer> stack = new Stack<>();
//        stack.push()
//        Deque<TreeNode> stack = new ArrayDeque<>();
//
//        System.out.println("gergseg ".lastIndexOf(" "));
//        int a =-1;
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.parseUnsignedInt("11111111111111111111111111111110",2));
//        //System.out.println(Integer.valueOf("11111111111111111111111111111111"));
//        System.out.println("gwefgw".substring(0,6));
//        List<List<Integer>> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(2);
//        list2.add(4);
//        //list2.remove(list2.size()-1);
//        System.out.println(list2.get(1));
//        int[] arr = {3,2,5,8,9};
//        System.out.println(Arrays.toString(arr));
//        StringBuilder s = new StringBuilder("2147483647");
//        System.out.println(s.reverse());
//        Integer.valueOf(String.valueOf(s.reverse()));
//        Integer.MIN_VALUE;
//        Integer.MAX_VALUE

//        System.out.println(Integer.toBinaryString(-1));
//        System.out.println(Integer.parseUnsignedInt("11111111111111111111111111111111",2));
//        String res = Integer.toBinaryString();
//        StringBuilder s = new StringBuilder(res);
//        String.valueOf(s.reverse());
//        System.out.println(Integer.parseUnsignedInt(String.valueOf(s),2));

//        System.out.println(Integer.reverse(13553));
//        StringBuilder s = new StringBuilder(String.valueOf(-121));
//        System.out.println(String.valueOf(s).equals(String.valueOf(s.reverse())));
//        Integer.MAX_VALUE
//        int x = 123;
//        long res = 0;
//        while(x!=0){
//            res = res*10+x%10;
//            x = x/10;
//        }
//        System.out.println(res);
//        System.out.println(res<Integer.MAX_VALUE&&(int)res==x?true:false);
//
//        System.out.println("ffAa".toLowerCase());
//        System.out.println((int)'a');
//        System.out.println("gsgsgsh".substring(0,0)+"gsgsgsh".substring(1,7));
//        char a = '???';
//        LinkedList<Integer> list = new LinkedList<>();
//        list.addFirst(1);
//        list.addFirst(2);
//        list.addFirst(3);
//        System.out.println(list);
//        System.out.println("fw"+1);
//
//        System.out.println(String.valueOf(1+'a'));
//        StringBuilder res = new StringBuilder;
//        res.toString();

//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> num = new ArrayList<>();
//        num.add(1);
//        num.add(2);
//        res.add(num);
//        res.add(num);
//        System.out.println(res.get(1).get(1));
//        StringBuilder str = new StringBuilder();
//        System.out.println("abcd".substring(1));
//        System.out.println("aewtg".substring(1, "aewtg".length() - 1));
//        "dfvdsf".indexOf("f");
//        int array[][][] = new int[][][]{                    // ????????????????????????
//                {{1, 2, 3}, {4, 5, 6}},
//                {{7, 8, 9}, {10, 11, 12}},
//                {{13, 14, 15}, {16, 17, 18}}
//        };
//        System.out.println(array.length);
//        System.out.println(array[0][0].length);
//        array[2][1][2] = 19;
//        for (int i = 0; i < array.length; i++) {            // ????????????
//            for (int j = 0; j < array[0].length; j++) {
//                for (int k = 0; k < array[0][0].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();                        // ???????????????????????????
//            }
//
//        }
//        int[][] arr2 = new int[3][2];
        //System.out.println((char)(8+1+'0'));
        //System.out.println(getString(2,4));
//        String s = "ab";
//
//        System.out.println(isPal("a"));
//        System.out.println("fasg".indexOf(""));
//        String s = "qwrqfw";
//        System.out.println(s.replace("q",""));
//        System.out.println(Integer.MIN_VALUE);
        //System.out.println((char)('A'+32));
//        Map<String,Integer> map = new HashMap<>();
//        map.put("a",1);
//        String S = "a";
//        System.out.println(map.get(S));
//        int[] a = {1,2,3,4};
//        int[] b = {2,3,9,8};
//        System.out.println("gweg".charAt(0));
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        System.out.println(queue.peek());
//        int[] a = new int[108];
//        a['a'] = 1;
//        a['A'] = 9;
//        System.out.println(Arrays.toString(a));
//        System.out.println(Integer.valueOf('A'));
//        for (int i = 0; i < args.length; i++) {
//
//            System.out.println(args[i]);
//
//        }
//        String s = "()(ertgseryg)hshts(hsrth)";
//
//        System.out.println(s.replaceAll("()","o"));
//        boolean[] t = new boolean[5];
//
//        System.out.println(t[1]);


//        System.out.println(Integer.MAX_VALUE);
//        List<BigInteger>



//        Map<String,Integer> map = new HashMap<>();
//        map.put("a",1);
//        System.out.println(map.get("b"));
//        System.out.println(Arrays.toString(new String[]{"asfda"}));
//        String[] res = "this apple is sweet".split("\\s");
//        System.out.println(Arrays.toString(res));
//        for(int i = 400;i<=1000;i+=10){
//            System.out.println("<calls holding-time=\"0.01\" rate=\""+i+"\" cos=\"1\" weight=\"1\"/>");
//        }
//        String s = "rewgqqoooooo";
////        System.out.println(s.indexOf('q',4));

//        System.out.println(1/2.0);
//        float[] res = new float[1];
//        res[0] = ((float)1/320/160);
//        System.out.println(res[0]);

//        List<Integer> l1 = new LinkedList<>();
//        List<Integer> l2 = new LinkedList<>();
//        Set<List> set = new HashSet<>();
//        l1.add(1);
//        l2.add(2);
//        set.add(l1);
//        System.out.println(l1.hashCode());
//        System.out.println(l2.hashCode());
//        System.out.println(set.contains(l2));

//        int[] a = {1,4,4,5,6,8,};
//        Arrays.sort(a, new Comparator<Integer>() {
//            @Override
//            public int compare(int i1, int i2) {
//                int num = i2 - i1;
//                return num;
//            }
//        });
//        List<Integer> res = new ArrayList();
//        res.add(2);
//        System.out.println(res.get(0));
//        String t = "  hrtoher ";
//        System.out.println(t.trim());
//        System.out.println(t);
//        System.out.println(t.substring(0,4));
//        System.out.println(t.substring(4));
//        System.out.println(Double.NaN);

//        System.out.println(Math.random());
//        String s = "\\\n";
//        System.out.println(s);
//        System.out.println((int)'\n');
//        Integer[] nums = new Integer[10];
//        for(int i = 0; i < 10; i++) {
//            nums[i] = 10 - i;
//        }
//        Arrays.sort(nums, Comparator.comparingInt(a -> a));
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Integer.valueOf("001"));
//        List<Integer> res = Arrays.asList(nums);
//        System.out.println(res.toString() + res.size());
//        double xt2 = 0;
//        int[] num = {1,2,2,3,5};
//        if(xt2 > 0 && xt2 >= num[-2]) {
//            System.out.println("false");
//        }
//        System.out.println(Math.pow(2,31));

        //todo:??????????????????
        double[] res = new double[5];
        Random random = new Random();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> (int) (res[a] - res[b]));
        for(int i = 0; i < 5; ++i) {
            res[i] = random.nextInt(5);
            pq.offer(i);
        }
        System.out.println(Arrays.toString(res));
        while(!pq.isEmpty()) {
            System.out.print(pq.poll() + "  ");
        }

        //todo:??????int[][] temp = new int[4][];   ????????????
        int[][] temp = new int[4][];
        for(int i = 0; i < temp.length; ++i) {
            temp[i] = new int[random.nextInt(10) + 1];
            for(int j = 0; j < temp[i].length; ++j) {
                temp[i][j] = random.nextInt(10);
            }
        }

        for(int i = 0; i < temp.length; ++i) {
            for(int j = 0; j < temp[i].length; ++j) {
                System.out.print(temp[i][j] + "  ");
            }
            System.out.println();
        }
        Arrays.sort(temp,(a,b)->(a.length - b.length));
        System.out.println("======================");

        for(int i = 0; i < temp.length; ++i) {
            for(int j = 0; j < temp[i].length; ++j) {
                System.out.print(temp[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println(0x3f3f3f3f);
        System.out.println("**************************");

//        System.out.println(random.nextDouble());

        double[][] re = new double[10][5];
        for(int i = 0; i < 10; ++i) {
            for(int j = 0; j < 5; ++j) {
                re[i][j] = random.nextDouble() * 100;
            }
        }
        System.out.println("?????????");
        for(int i = 0; i < 10; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print(re[i][j] + "\t");
            }
            System.out.println();
        }

        re[3][3] = 5;
        re[4][3] = 5;
        Arrays.sort(re, (a, b)-> Double.compare(a[3], b[3]));

        System.out.println("?????????");
        for(int i = 0; i < 10; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print(re[i][j] + "\t");
            }
            System.out.println();
        }

        Double a = (double) 2;
        System.out.println(a.compareTo((double)5));
        double b = 3;



    }

    @org.junit.Test
    public void test0() {
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        p1.offer(89);
//        p2.offer(p1.remove(0));
        Random rand = new Random();
        System.out.println(rand.nextInt(1));

        System.out.println(Character.toLowerCase('A'));
        System.out.println("dfAGERGgw".toLowerCase());

        System.out.println(Integer.highestOneBit(16));
    }



















//    public static boolean isPal(String s){
//        int i = 0,j = s.length()-1;
//        while(i < j){
//            if(s.charAt(i) == s.charAt(j)){
//                i++;
//                j--;
//            }else{
//                return false;
//            }
//        }
//        return true;
//    }
}
//
//    public static int fuc(int a) {
//
//        String s;
//        if(a>=0){
//            s= String.valueOf(a);
//            StringBuilder stringBuilder= new StringBuilder(s);
//            stringBuilder.reverse();
//            long res= Long.parseLong(stringBuilder.toString());
//            return (int) res == res ? (int) res : 0;
//        }
//        else{
//            s=String.valueOf(-a);
//            StringBuilder stringBuilder= new StringBuilder(s);
//            stringBuilder.append('-');
//            stringBuilder.reverse();
//            long res= Long.parseLong(stringBuilder.toString());
//            return (int) res == res ? (int) res : 0;
//        }
//
//    }
//}
