package java之arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class java之录入学生信息 {
    public static void main(String[] args) {
        ArrayList<student> s=new ArrayList<student>();
        addStudent(s);
        addStudent(s);
        addStudent(s);
        for (int i=0;i<s.size();i++){
//            方法一：直接调用
            System.out.println(s.get(i).getName()+" "+s.get(i).getAge());
//              方法二：先用一个学生对象接收，再调用get方法
            student a=s.get(i);
            System.out.println(a.getName()+":"+a.getAge());
        }
    }
    public static void addStudent(ArrayList<student> array){
        student s=new student();
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入学生的姓名：");
        s.setName(sc.nextLine());
        System.out.print("请输入学生的年龄：");
        s.setAge(sc.nextLine());
        array.add(s);
    }
}
