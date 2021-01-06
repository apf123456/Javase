package java集合之Map集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class java集合之map集合2 {
    public static void main(String[] args) {
        Map<Integer,String> mp1=new HashMap<>();
        mp1.put(1,"xusong");
        mp1.put(2,"huxia");
        System.out.println(mp1.size());
        System.out.println(mp1.get(01));
        Set<Integer> Keyset=mp1.keySet();
        for (Integer ks:Keyset){
            System.out.println(ks);
        }
        Collection<String> dsd  = mp1.values();
        for(String d:dsd){
            System.out.println(d);
        }


    }
}
