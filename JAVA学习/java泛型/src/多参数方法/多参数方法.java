package 多参数方法;

public class 多参数方法 {
    public static void main(String[] args) {
    sum(1,2,3,4,5);

    }
    public static void sum(int... a){
        System.out.println(a);
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1+=a[i];
        }
        System.out.println(sum1);
    }
}
