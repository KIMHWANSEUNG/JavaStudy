package com.study;

public class Exercise04 {
    public static void main(String[] args) {
        int eye1 = 0;
        int eye2 = 0;

        while (eye1+eye2!=5) {
            eye1 = (int) (Math.random()*6)+1;
            eye2 = (int) (Math.random()*6)+1;


            System.out.println(eye1+","+eye2);
        }
    }
}
