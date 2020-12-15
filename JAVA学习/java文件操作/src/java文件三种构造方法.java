import java.io.File;
import java.io.IOException;

public class java文件三种构造方法 {
    public static void main(String[] args) throws IOException {
//      第一种方法单纯的路径名字符串
        File f1=new File("C:\\sdsd\\java的第一种构造方法.txt");
        f1.createNewFile();
//      第二种方法，字符串，字符串
        File f2=new File("C:\\sdsd","java的第二种构造方法.txt");
        f2.createNewFile();
//        第三种方法，路径名，字符串
        File f3=new File("C:\\sdsd");
        File f4=new File(f3,"java的第三种构造方法.txt");
        f4.createNewFile();
    }
}
