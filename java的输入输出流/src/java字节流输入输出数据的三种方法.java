import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class java字节流输入输出数据的三种方法 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=new FileOutputStream("lubenwei.txt");
        byte[] a={48,49,50,51,52};
        f1.write(a);
        byte b[]="0123456789".getBytes();
        f1.write(b);
    }
}
