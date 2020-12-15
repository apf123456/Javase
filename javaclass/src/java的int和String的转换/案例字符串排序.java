package java的int和String的转换;

import java.util.Arrays;

public class 案例字符串排序 {
    public static void main(String[] args) {
        String s="12:34:13:45";
        String[] s1=s.split(":");
        int[] arr=new int[s1.length];
        for(int i=0;i<s1.length;i++){
            arr[i]=Integer.parseInt(s1[i]);
        }
        maopao(arr);
        System.out.println(Arrays.toString(arr));

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                sb.append(arr[i]);
            }
            else {
                sb.append(arr[i]+" ");
            }
        }
        s=sb.toString();
        System.out.println(s);
    }
    public static void maopao(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                int temp=arr[j];
                if (arr[j]>arr[j+1]){
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
