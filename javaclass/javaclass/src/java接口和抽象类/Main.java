package java接口和抽象类;

public class Main {
    public static void main(String[] args) {
        Cat c=new Cat("芦苇",6);
        c.eat();
        c.jump();
        c.show();

        jumping jp=new Cat();
        jp.jump();

        Animals a=new Cat();
        a.eat();
        a.show();
    }
}
