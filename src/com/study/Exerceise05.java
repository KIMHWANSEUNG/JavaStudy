package com.study;

public class Exerceise05 {

    public static void main(String[] args) {
     //10자리 버리는 코드
        int value = 356;
        System.out.println(value-=value%100);
        int result=1;
     //1부터 100까지 3의 배수의 합
        for(int i=1;i<=100;i++){
            if((i%3)==0){
                result+=i;
            }
        }
        System.out.println("1부터 100까지 3의 배수의 합:"+result);
    }
}
