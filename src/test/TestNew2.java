package test;

/**
 * @Author: Blue
 * @Date: 2021/6/15
 * @Time: 15:57
 * @Description:
 */
public class TestNew2 {
    public static void main(String[] args) {
        int[] temp = {1,2,3,4,5,6};
        System.out.println(modulationLevel(100, temp, 3));
    }
    //返回加强之后的调制
    public static int modulationLevel(double rate, int[] temp, int slot) {
        int modu = 0;
        for(int i = 0; i < temp.length; ++i) {
            if(Math.ceil(rate / (12.5 * temp[i])) == slot) {
                return temp[i];
            }
        }
        return 0;
    }

}
