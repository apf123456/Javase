import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class java集合之collection {
    public static void main(String[] args) {
        Collection<String> cl=new ArrayList<>(3);
        cl.add("dsds");
        cl.add("sdd");
        cl.add("aasd");
        cl.remove("sdd");
        cl.add("哈子给");
        System.out.println(cl.contains("asssssss"));
        System.out.println(cl.isEmpty());
        System.out.println(cl);
//        cl.clear();
//        System.out.println(cl);
        Iterator<String> it=cl.iterator();
        while (it.hasNext()){
//            System.out.println(it.next());
            String s=it.next();
            System.out.println(s);
        }
    }
}
