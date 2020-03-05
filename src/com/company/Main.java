package com.company;

import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class Main {

    public static void main(String[] args) {
        Main myMain = new Main();

//        int [] nums = {12,345,2,6,7896};
//        int[] nums = {0,901,482,1771};
//        mymain.findNumbers(nums);

//        mymain.numJewelsInStones("z", "ZZ");
//        String s = "RLRRRLLRLL";
//        mymain.balancedStringSplit(s);

//        ListNode listNode = new ListNode(1);
//        listNode.next = new ListNode(0);
//        listNode.next.next = new ListNode(1);
//        listNode.next.next.next = null;
//        mymain.getDecimalValue(listNode);

//        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
//        mymain.countNegatives(grid);

//        int[][] grid = {{1,1},{3,4},{-1,0}};
//        myMain.minTimeToVisitAllPoints(grid);

//        int num = 9669;
//        myMain.maximum69Number(num);
//        int[] num = {17,18,5,4,6,1};
//        myMain.replaceElements(num);

//        myMain.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#");
//        myMain.numberOfSteps(17);
//        int[] num = {8,1,2,2,3};
//        myMain.smallerNumbersThanCurrent(num);
//        myMain.defangIPaddr("255.100.50.0");
//        int[] num = {1,2,3,4};
////        myMain.decompressRLElist(num);
        myMain.sumZero(1);
    }
    public int[] sumZero(int n) {
        int[] outList = new int[n];
        int i,j = 0;
        for(i = 0; i < n / 2; i++){
            outList[j++] = (i + 1);
            outList[j++] = -i - 1;
        }
        if (n % 2 == 1){
            outList[j] = 0;
        }

        for(j = 0; j < n; j++){
            System.out.println(outList[j]);
        }
        return outList;
    }
    public int[] decompressRLElist(int[] nums) {

        // 声明可变长数组
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i,j;
        for(i = 0; i < nums.length; i += 2){
            for (j = 0; j < nums[i]; j++){
                arrayList.add(nums[i + 1]);
            }

        }

        // Arraylist 转list
        int[] numList = new int[arrayList.size()];
        for(i = 0; i < numList.length; i++){
            numList[i] = arrayList.get(i);
            System.out.println(numList[i]);
        }
        return numList;
    }
    public String defangIPaddr(String address) {
        
        return address.replace(".","[.]");

    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] outBuffer = nums.clone();
        Map<Integer, Integer> mapBuffer = new HashMap<Integer, Integer>();


        // 按升序排列
        Arrays.sort(nums);

        // 比最小值更小的是0个
        mapBuffer.put(nums[0], 0);

        // 遍历 记录每个最小值出现的下标，即比它小的值的个数
        for(int i = 0; i < nums.length - 1; i++){
            if (nums[i] != nums[i + 1]){
                mapBuffer.put(nums[i + 1], i + 1);
            }
        }
        // 根据map求德每位比它小值的个数
        for(int i = 0; i < nums.length ; i++){
            outBuffer[i] = mapBuffer.get(outBuffer[i]);
        }
        System.out.println(Arrays.toString(outBuffer));
        return outBuffer;
    }
    public int numberOfSteps (int num) {
        int outStep = 0;
        while(num > 0){
            if (num % 2 == 0){
                num /= 2;
            }
            else{
                num -= 1;
            }
            outStep += 1;
        }
        System.out.println(outStep);
        return outStep;

    }
    public int maximum69Number (int num) {
        int maxVal = num;
        String numStr = String.valueOf(num);
        char[] numChar = numStr.toCharArray();

        for (int i = 0; i < numChar.length; i++){
            if (numChar[i] == '6'){
                maxVal += 3 * Math.pow(10, (numChar.length - i - 1));
                break;
            }
        }
        System.out.println(maxVal);
        return maxVal;

    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length - 1; i++){
            count += Math.max(Math.abs(points[i][0] - points[i + 1][0]), Math.abs(points[i][1] - points[i + 1][1]));
        }
        System.out.println("count = " + count);
        return count;

    }

    public int countNegatives(int[][] grid) {
        // 统计负数个数 数组降幂排列
        int cuontNum = 0;
        for(int i = 0; i < grid.length; i ++){
            int j = 0;
            for(j = 0; j < grid[i].length; j++){
                if (grid[i][j] < 0){
                    break;
                }
            }
            cuontNum += (grid[i].length - j);

        }
        System.out.println("cuontNum = " + cuontNum);
        return cuontNum;

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

    public int[] replaceElements(int[] arr) {
        int[] outList = new int[arr.length];
        outList[arr.length - 1] = -1;

        for(int i = arr.length - 1; i > 0; i--){
            if (arr[i] > outList[i]){
                outList[i - 1] = arr[i];
            }
            else{
                outList[i - 1] = outList[i];
            }
//            System.out.println("arr = " + arr[i]);

        }
        System.out.println(Arrays.toString(outList));
        int b = 'a' - '0';
        System.out.println('a' - '0');
        return outList;
    }

    public String freqAlphabets(String s) {
        System.out.println(s);
        char[] charList = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = charList.length - 1; i >= 0 ;){
            int temp;
            if (charList[i] == '#'){
                temp = (charList[i - 1] - '0');
                temp += (charList[i - 2] - '0') * 10;
                temp -= 10;
                temp += 'j';
                i -= 3;
            }
            else{
                temp = charList[i] - '1' + 'a';
                i--;
            }
            stringBuffer.append((char)temp);
        }
        stringBuffer.reverse();
        String strOut = stringBuffer.toString();
        System.out.println(strOut);
        return strOut;
    }
}
