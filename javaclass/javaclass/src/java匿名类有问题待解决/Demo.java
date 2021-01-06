package java匿名类有问题待解决;

interface jumping{
    public void show();
}
class Outer{
    private int a=5;
    public void zhixing(){
        new jumping() {
            public void show() {
                System.out.println("hh");
            }
        }.show();
    }
        }
public class Demo {
    public static void main(String[] args) {
       Outer ot=new Outer();
       ot.zhixing();
    }
}
