public class java之异常 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        int a[]={1,2,3};
        try{
            System.out.println(a[3]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());//返回详细消息字符串
            e.printStackTrace();//把异常信息输出在控制台
            System.out.println(e.toString());//返回简短描述
        }
    }
}
