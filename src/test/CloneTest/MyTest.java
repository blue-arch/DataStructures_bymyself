package test.CloneTest;

/**
 * @Author: Blue
 * @Date: 2021/7/7
 * @Time: 15:57
 * @Description:
 */
public class MyTest {
    public static void main(String[] args) {
        TestClassClone testClassClone = new TestClassClone(10);
//        TestClassClone temp = (TestClassClone) testClassClone.clone();


    }
}

class TestClassClone{
    public int a;

    public TestClassClone() {
    }

    public TestClassClone(int a) {
        this.a = a;
    }
}
