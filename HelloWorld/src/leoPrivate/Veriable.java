package leoPrivate;

import java.util.ArrayList;

public class Veriable {

    // 声明类变量 所有实例共享改变量
    static int iStatic = 0;

    // 声明成员变量
    int iMember = 0;

    // final声明为常量 不可变
    final int iFinal = 0;

    // final声明的容器不可变 容器中内容可变
    final ArrayList<String> arrayFinal = new ArrayList<>();

    // final变量可以只声明不初始化，在构造函数中初始化
    final String name;

    // 字符串变量 本质上是指针
    String S = null;

    final String[] ss = new String[10];

    public void Test(){
        System.out.printf("变量测试！\n");

        // 声明随机数实例
        java.util.Random random = new java.util.Random();

        int a = 0;

        // 声明一个长度为10的数组变量
        int [] nums = new int[10];

        for (a = 0; a < 10; a++) {

            nums[a] = random.nextInt();
            System.out.printf("a = %d 随机数 nums[%d] = %d\n", a, a, nums[a]);
        }

        int [] arr = {1, 2, 3, 4, 5};
        System.out.println("测试foreach用法");
        for (int x : arr) {
            System.out.println("x = " + x);
        }

    }

    // 静态函数
    static void staticTest(){
        System.out.println("这是一个静态函数staticTest\n");
    }

    // 静态函数
    static void staticTest2(){
        staticTest();
    }
    // 构造函数
    public Veriable(String claseName){

        name = claseName;

    }

    // 静态代码块
    static{
        System.out.println("静态代码块在加载类时会自动执行\n");
    }

    class TestClass{
        int i = 0;
        public void drawSahpe() {
            System.out.println("内部类");
        }
    }

    public void fun(){                      // 定义外部类的方法
        new TestClass().drawSahpe() ;               // 通过内部类的实例化对象调用方法
    }

}
