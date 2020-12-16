public class Zi extends Fu {
    Zi(int age){
        super(20);
        System.out.println("我是子类的带参初始化");
    }
    Zi(){
        super(20);
        System.out.println("我是子类的不带参初始化");
    }
}
