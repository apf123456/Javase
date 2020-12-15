package java的常用api之math;

public class java常用api之math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(15.6));
        System.out.println(Math.floor(15.6));
        System.out.println(Math.round(15.51));
        System.out.println(Math.max(15.6f,16.5f));
        System.out.println(Math.min(15.6f,16.5f));
        System.out.println(Math.pow(5,3));//平方
        System.out.println(Math.random());//产生0到1的随机数，且不包括1
        System.out.println(Math.cos(Math.PI/3));
        System.out.println(System.currentTimeMillis());
        System.exit(1);//0以外表示异常终止
    }
}
