package 泛型接口;

public class 泛型接口 {
    public static void main(String[] args) {
        Xuexi<String> s1=new Student<String>();
        s1.show("卢本伟");
        Xuexi<Integer> s2=new Student<Integer>();
        s2.show(20);
    }
}
