import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class java集合之list {
    public static void main(String[] args) {
        List<Student> ls=new ArrayList<Student>();
        Student s1=new Student(15,"安鹏飞");
        Student s2=new Student(15,"张凯伦");
        Student s3=new Student(15,"杜轩");
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        Iterator<Student> it=ls.iterator();
        while (it.hasNext()){
            Student s=it.next();
            System.out.println(s.getName()+":"+s.getAge());
        }
    }
}
