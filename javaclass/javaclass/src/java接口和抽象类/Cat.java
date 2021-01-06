package java接口和抽象类;

import java接口和抽象类.jumping;

public class Cat extends Animals implements jumping {
    @Override
    public void eat(){
        System.out.println("猫吃老鼠");
    }
    @Override
    public void jump(){
        System.out.println("猫跳高");
    }
    public Cat(){
        super();
    }
    public Cat(String name,int age){
     super(name,age);

    }

}
