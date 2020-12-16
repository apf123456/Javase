//append 和reverse这两个方法是stringbuilder有的
public class java的api之stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println("sb:"+sb);
        System.out.println(sb.length());
        sb.append("hello");
        System.out.println(sb);

        StringBuilder sb1=sb.append(" java");
        System.out.println(sb+" "+sb1);
        System.out.println(sb==sb1);
        sb.append(100).append(50).append(100);
        System.out.println(sb);
//将stringbuilder转换为string要用到tostring方法
        String s=sb.toString();
        System.out.println(sb);
//        将string转换为stringbuilder要用到stringbuilder的构造方法
        StringBuilder b=new StringBuilder(s);
    }

}
