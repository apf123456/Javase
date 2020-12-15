package java之arraylist;

import java.util.ArrayList;

public class java之arraylist {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(0,1);
        al.add(1,1);
        al.add(2,1);
        al.add(3,"sdsds");
        al.add(4,1);
        al.add(2,1);
        System.out.println(al.size());
        System.out.println(al.indexOf(1));
        System.out.println(al);
        System.out.println(al.getClass());
        int a[]={5,5,6};
        System.out.println(a.getClass());

    }
}
