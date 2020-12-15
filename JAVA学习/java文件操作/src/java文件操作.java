import java.io.File;
import java.io.IOException;

public class java文件操作 {
    public static void main(String[] args) throws IOException {
        File f1=new File("\\sdsd");
        f1.mkdir();
        File f2=new File("\\sdsd\\java.txt");
        f2.createNewFile();
        System.out.println("创建文件夹sdsd以及文件夹中的文件java.txt");
        System.out.println("返回绝对路径: "+f1.getAbsolutePath());
        System.out.println("返回相对路径: "+f1.getPath());
        System.out.println("是否是文件夹: "+f1.isDirectory());
        System.out.println("是否可读: "+f1.canRead());
        System.out.println("是否文件: "+f1.isFile());
        System.out.println("是否存在: "+f1.exists());
        System.out.println("是否隐藏文件: "+f1.isHidden());
        System.out.println("是否相等: "+f1.equals(f2));
        System.out.println("f1代表的名称: "+f1.getName());
//        .list方法返回此抽象路径名表示的目录中的文件和目录的名称字符串数组，返回的是String数组
        String[] strArry=f1.list();
        for(String str:strArry){
            System.out.println(str);
        }
//        .listFiles方法是返回某个目录下所有文件和目录的绝对路径，返回的是File数组
        File f3=new File("C:\\sdsd\\asas");
        f3.mkdir();
        File[] strArry2=f1.listFiles();
        for (File file:strArry2){
            if(file.isDirectory()){
                System.out.println(file);
                System.out.println(file.getName());
            }
        }

//        删除一个目录前必须删除目录所有文件后才可以删除
        f3.delete();
    }

}
