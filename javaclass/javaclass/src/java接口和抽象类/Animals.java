package java接口和抽象类;

public abstract class Animals{
    private int age=5;
    private String name="卢本伟";
    public Animals(){};
    public Animals(String name,int age){
        this.age=age;
        this.name=name;
    };
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public abstract void eat();
    public void show(){
        System.out.println("动物名称:"+name+" 年龄:"+age);
    }
}
