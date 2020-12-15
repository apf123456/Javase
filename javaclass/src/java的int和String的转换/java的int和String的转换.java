package java的int和String的转换;

public class java的int和String的转换 {
    public static void main(String[] args) {
        int number=111;
//        int类型转换为String类型的三种方法
        String s1=number+"";
        String s2=Integer.toString(number);
        String s3=String.valueOf(number);
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s1);
        System.out.println("s3:"+s1);
//        String类型转换为int类型的两种方法
        String s="155";
        int n1=Integer.parseInt(s);
        int n2=Integer.valueOf(s).intValue();
        System.out.println(n1+" "+n2);
        System.out.println(s2);
    }
}
