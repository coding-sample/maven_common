package com.example;

public class StringUtil {
    public String getRepo() {
        return "Comm";
    }

    /**
     * 数値の配列の合計を計算します。
     * 
     * @param numbers 合計を計算する数値の配列
     * @return 数値の合計
     */
    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

