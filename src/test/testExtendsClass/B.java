package test.testExtendsClass;

/**
 * @Author: Blue
 * @Date: 2021/5/17
 * @Time: 13:58
 * @Description:
 */
public class B extends A{
    private int ts;
    public B(int t, int ts) {
        super(t);
        this.ts = ts;
    }
    public void print() {
        System.out.println(this.getT());
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }
}
