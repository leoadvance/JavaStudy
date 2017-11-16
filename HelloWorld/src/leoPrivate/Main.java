package leoPrivate;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("ui");

        frame.setContentPane(new GuiTest().jpanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

	// write your code here

        System.out.printf("Hello World\n");

        // 实例化贪吃蛇类
        Snake snakeGame = new Snake();



//        // 新建实例
        Veriable    veriable1    = new Veriable("Class1");
        Veriable    veriable2    = new Veriable("Class2");
        VeriableSon VeriableSon1 = new VeriableSon("ClassSon1");
//        veriable1.Test();
//
//        for (int i = 0; i < 10; i++) {
//
//            veriable1.iStatic++;
//            veriable1.iMember++;
//            System.out.printf("veriable1.iStatic = %d, veriable1.iMember = %d\n", veriable1.iStatic, veriable1.iMember);
//            veriable2.iStatic++;
//            veriable2.iMember++;
//            System.out.printf("veriable2.iStatic = %d, veriable2.iMember = %d\n", veriable2.iStatic, veriable2.iMember);
//        }
//
//        System.out.println("veriable1.iFinal = " + veriable1.iFinal);
//        veriable1.arrayFinal.add("aaa");
//        veriable1.arrayFinal.add("bbb");
//        System.out.println("veriable1.arrayFinal =" +  veriable1.arrayFinal);
//
//        veriable1.S = "Name";
//        veriable1.ss[0] = "Hello";
//        System.out.println(veriable1.ss[0]);
//
//        System.out.println("Class1 name = " + veriable1.name + "\n");
//        System.out.println("Class2 name = " + veriable2.name + "\n");
//        System.out.println("static iStatic = " + Veriable.iStatic + " static 声明的参数无需实例化就能访问\n");
//
//        // 静态函数
//        Veriable.staticTest2();

//        // 调用父类方法
//        VeriableSon1.Test(1);
//        VeriableSon.staticTest();
//        VeriableSon1.staticTest();
    }
}


