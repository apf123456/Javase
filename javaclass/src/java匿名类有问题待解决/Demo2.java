package java匿名类有问题待解决;
abstract class student1 {
    public abstract void show();
}
class Outer1{
    private int a=1;
    public void methond(){
        new student1() {
            public void show() {
                System.out.println(1);
            }
        }.show();
        }
    }


public class Demo2 {
    public static void main(String[] args) {
    Outer1 ot=new Outer1();
    ot.methond();
    }
}
