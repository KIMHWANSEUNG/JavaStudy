package com.study;

//배열 안에서 최댓값 구하기
public class Ex5_07 {
    public static void main(String[] args) {

        int max = 0;
        int[] arr = {1, 5, 3, 8, 2};

        for (int arrs : arr) {
            if (max < arrs) {
                max = arrs;
            }
        }
        System.out.println(max);
    }
}

