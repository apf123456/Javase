package java集合之Map集合;
import java.util.HashMap;
import java.util.Map;
public class java集合之map集合1 {
    public static void main(String[] args) {
        Map<String,String> mp1=new HashMap<>();
        mp1.put("00001","lubenwei");
        mp1.put("00002","mafeifei");
        System.out.println(mp1);
        System.out.println("mp1.isEmpty(): "+mp1.isEmpty());
        System.out.println(mp1.containsKey("00003"));
        System.out.println(mp1.containsValue("mafeifei"));
        System.out.println(mp1.size());
        System.out.println(mp1.remove("00002"));
        System.out.println(mp1.size());
        mp1.clear();
    }
}
