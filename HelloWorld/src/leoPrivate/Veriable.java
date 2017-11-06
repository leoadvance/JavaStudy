package leoPrivate;

public class Veriable {

    // 声明类变量 所有实例共享改变量
    static int iStatic = 0;

    // 声明成员变量
    int iMember = 0;


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

    }

}
