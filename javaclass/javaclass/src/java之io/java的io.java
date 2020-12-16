import java.io.File;
import java.io.IOException;

public class java的io {
    public static void main(String[] args) throws IOException {
        File f1 =new File("javaclass\\ceshi1.txt");
        System.out.println(f1);
        f1.createNewFile();
        File f2=new File("F:\\aaa\\javaclass\\src\\java之io\\niubi");
        f2.mkdir();
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.exists());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
    }
}
