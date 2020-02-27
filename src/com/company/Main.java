package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Main mymain = new Main();
//        int [] nums = {12,345,2,6,7896};
//        int[] nums = {0,901,482,1771};
//        mymain.findNumbers(nums);

        mymain.numJewelsInStones("z", "ZZ");

    }
    public int numJewelsInStones(String J, String S) {
        Map<Character,Integer> tempMap = new HashMap<Character,Integer>();
        char[] cArray =S.toCharArray();
        for(char cc:cArray) {
           if (tempMap.get(cc) == null) {
               tempMap.put(cc, 1);
           }
           else {
               tempMap.put(cc, tempMap.get(cc) + 1);
           }
        }
        // 字符串转数组
        int total = 0;
        for(char c:J.toCharArray()) {
            if(tempMap.get(c) != null) {
                total += tempMap.get(c);
            }

        }
        System.out.println(total+"个");
        return total;

    }
    public int findNumbers(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10){
                continue;
            }
            int temp = 0;
            while (nums[i] > 0)
            {
                temp++;
                nums[i] /= 10;
            }
//            System.out.printf("temp num = %d\r\n", temp);
            if (temp % 2 == 0){
                even++;
            }
        }
        System.out.printf("even num = %d\r\n", even);
        return even;
    }
}
