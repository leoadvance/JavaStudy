package leoPrivate;
public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.printf("Hello World\n");

        // 新建实例
        Veriable veriable1 = new Veriable();
        Veriable veriable2 = new Veriable();
        veriable1.Test();

        for (int i = 0; i < 10; i++) {

            veriable1.iStatic++;
            veriable1.iMember++;
            System.out.printf("veriable1.iStatic = %d, veriable1.iMember = %d\n", veriable1.iStatic, veriable1.iMember);
            veriable2.iStatic++;
            veriable2.iMember++;
            System.out.printf("veriable2.iStatic = %d, veriable2.iMember = %d\n", veriable2.iStatic, veriable2.iMember);
        }

        System.out.println("veriable1.iFinal = " + veriable1.iFinal);
//        veriable1.iFinal++;
        veriable1.arrayFinal.add("aaa");
        veriable1.arrayFinal.add("bbb");
        System.out.println("veriable1.arrayFinal =" +  veriable1.arrayFinal);

        veriable1.S = "Name";
        veriable1.ss[0] = "Hello";
        System.out.println(veriable1.ss[0]);
    }
}
