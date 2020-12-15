package 泛型接口;

public class Student<T> implements Xuexi<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
