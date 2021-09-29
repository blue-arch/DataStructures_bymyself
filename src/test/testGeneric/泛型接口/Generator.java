package test.testGeneric.泛型接口;

/**
 * @Author: Blue
 * @Date: 2021/7/13
 * @Time: 15:49
 * @Description:
 */
//定义一个泛型接口
public interface Generator<T> {
    public T next();
}