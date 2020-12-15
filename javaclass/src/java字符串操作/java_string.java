package java字符串操作;

import java.util.Scanner;

public class java_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String as=sc.nextLine();
        for(int i=0;i<as.length();i++){
            System.out.print(as.charAt(i)+" ");
        }
    }
}
