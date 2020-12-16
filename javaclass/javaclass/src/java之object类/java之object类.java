public class java之object类 {
    public static void main(String[] args) {
        student s1=new student("卢本伟",12);
        System.out.println(s1);
        System.out.println(s1.toString());
        student s2=new student("卢本伟",12);
//        默认使用object的tostring方法
        System.out.println(s1.equals(s2));
//        默认object的equals方法
// public boolean equals(Object obj) {
//            return (this == obj);
//        }
        System.out.println(s1==s2);
    }
}
