package java的int和String的转换;
//可以直接使用基本数据类型的包装类进行基本类型运算，运算时自动装箱和拆箱
public class java自动装箱和拆箱 {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(111);
        Integer ii=100;
        i=i.intValue()-11;
        ii=Integer.valueOf(ii.intValue()-11);
        System.out.println(ii);
        Integer iii=10;
        iii=iii+10;

    }
}
