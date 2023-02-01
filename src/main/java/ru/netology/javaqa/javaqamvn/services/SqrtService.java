package ru.netology.javaqa.javaqamvn.services;

public class SqrtService {

    public int calcSqrt(int x, int y) {
        int result = 0;
        int i;
        for (i = 10; i <= x; i++) {
            if (i * i >= x && i * i <= y) {
                result = result + 1;
            }
        }
        System.out.println(result);
        return result;
    }
}