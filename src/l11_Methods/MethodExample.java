package l11_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        readArray();
    }
    public static int [] readArray(){
        int [] arr;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        n=in.nextInt();
        arr = new int[n];
        System.out.println("Массив состоит из "+n+" элементов, введите первое число");
        for(int i = 0; i<n;i++){
            arr[i]=in.nextInt();
            System.out.println((i+1) +" чиcло = "+arr[i] +", введите "+ (i+2) +" число ");
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static  void func(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
            System.out.println(result);
        }


    }
}
