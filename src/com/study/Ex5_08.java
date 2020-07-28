package com.study;
//향상된 for문으로 배열에 값 더해서 총합, 평균 구하기
public class Ex5_08 {
    public static void main(String[] args) {
        int sum = 0;
        int count=0;
        double avg=0;
        int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
        for(int[] i:array){
            for(int j:i){
                sum+=j;
                count++;
            }

        }
        System.out.println("총합:"+sum);
        avg=sum/count;
        System.out.println("평균:"+avg);
    }
}

