import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流写数据 {
    public static void main(String[] args) throws IOException {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        FileOutputStream f1=new FileOutputStream("F:\\aaa\\emo1.txt");
        f1.write(48);
        f1.write(49);
        System.out.println(f1.getChannel());
        File f2=new File("hhh.txt");
        f2.createNewFile();
        f1.close();
        System.out.println("改变");
    }
}
