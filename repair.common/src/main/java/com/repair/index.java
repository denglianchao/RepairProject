package com.repair;

/**
 * Created by lenovo on 2017/7/22.
 */
public class index {
    private static int num = 0;
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        long a = Runtime.getRuntime().maxMemory();
        long b = Runtime.getRuntime().totalMemory();
        System.out.println("-----------max:"+ a/1024/1024);
        System.out.println("-----------total:"+ b/1021/1021 );
    }

}
