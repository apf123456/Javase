package 泛型类;

public class 泛型类 {
    public static void main(String[] args) {
        Student<String> s1=new Student<String>();
        s1.setT("卢本伟");
        System.out.println(s1.getT());

        Student<Integer> s2=new Student<Integer>();
        s2.setT(20);
        System.out.println(s2.getT());

    }
}
