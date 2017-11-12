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
    String name = "NULL";

    // 字符串变量 本质上是指针
    String S = null;

    final String[] ss = new String[10];

    private int iPrivate = 0;

    public void Test(){
        iPrivate++;
        System.out.println("变量测试！ Class = " + name);

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
        this.privateTest();

    }

    // 静态函数
    static void staticTest(){
        System.out.println("这是一个静态函数staticTest\n");
    }

    // 静态函数
    static void staticTest2(){
        staticTest();
    }

    private void privateTest(){
        System.out.println("这一个private方法，无法被子类继承");
    }

    // 构造函数
    public Veriable(String className){

        name = className;
        System.out.println("Vearable 类 有参数构造方法运行， className = " + className);


    }
    public Veriable(){

        System.out.println("Vearable 类 无参数构造方法运行");

    }
    // 静态代码块
    static{
        System.out.println("静态代码块在加载类时会自动执行,只会运行一次，限于构造函数运行\n");
    }

    class TestClass{
        int i = 0;
        public void drawSahpe() {

            System.out.println("内部类");
        }
    }


}
class VeriableSon extends Veriable{

    int iSon = 0;

    public VeriableSon(String className) {

        super(className);
        System.out.println("VearableSon 类构造函数运行，类名 = " + className);
    }

    public VeriableSon( ) {

        System.out.println("VearableSon 类 无参数 构造函数运行" );
    }

    public void Test(int i){
        System.out.println("子类Test重构" + i);
    }
}