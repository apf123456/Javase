package java冒泡排序;

import java.util.Arrays;

public class java冒泡排序 {
    public static void main(String[] args) {
        int a[]={5,15,10,20,50,37};
        System.out.println(Arrays.toString(a));
        maopao(a);


        System.out.println(Arrays.toString(a));
    }
     public static void maopao(int[] a){
        for (int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                int temp=a[j];
                if (a[j]>a[j+1]){
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
