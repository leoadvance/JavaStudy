package leoPrivate;

public class Veriable {
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
