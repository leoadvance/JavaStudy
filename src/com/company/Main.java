package com.company;

import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Main mymain = new Main();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(0);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = null;
//        int [] nums = {12,345,2,6,7896};
//        int[] nums = {0,901,482,1771};
//        mymain.findNumbers(nums);

//        mymain.numJewelsInStones("z", "ZZ");
//        String s = "RLRRRLLRLL";
//        mymain.balancedStringSplit(s);
        mymain.getDecimalValue(listNode);
    }
    public int getDecimalValue(ListNode head) {
    // 题目是把链表里的0和1按二进制方式组合并输出，用指针+链表+位移即可
        int outVal = 0;
        while(head != null){
            outVal <<= 1;
            outVal += head.val;
            head = head.next;
        }
        System.out.println(outVal);
        return outVal;
    }
    // 题目考察RL中出现同等长度字符次数 其实就是左右步行回归原点问题
    public int balancedStringSplit(String s) {
//        System.out.println(s);
        int temp = 0;
        int groupNum = 0;
        // 遍历
        for(char c:s.toCharArray()) {
            if (c == 'R') {
                temp++;
            }
            else {
                temp--;
            }
            if (temp == 0) {
                groupNum++;
            }
        }
        System.out.println(s + " Group = " + groupNum);
        return groupNum;
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
