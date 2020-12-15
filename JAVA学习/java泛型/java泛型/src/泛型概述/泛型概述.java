package 泛型概述;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 泛型概述 {
    public static void main(String[] args) {
        Collection<String> cs=new ArrayList<String>();
        cs.add("Hello ");
        cs.add("World ");
        cs.add("Java ");
        Iterator<String> it= cs.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
    }
}
