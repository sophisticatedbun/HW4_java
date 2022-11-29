package com.ybelyaeva;

public class Main {
    public static void main(String[] args) {
        byte varByte = 125;
        short varShort = 32000;
        int varInt = 55000;
        long varLong = 9100000000000000000L;
        float varFloat = 4.5f;
        double varDouble = 1.7d;
        boolean varBoolean = false;
        char varChar = 'a';

        // Переполнение при вычислениях
        System.out.println(varByte+5);
        System.out.println(varShort+770);
        System.out.println(varInt*1000000);

        //Вычисления комбинации типов данных
        System.out.println(varByte+varDouble);
        System.out.println(varInt-varFloat);
        System.out.println(varInt*varByte);
        System.out.println(varLong/varDouble);

        //Логические операторы и условная конструкция
        if (!varBoolean && varInt > 10) {
            System.out.println(varChar);
        } else {
            System.out.println("Строка не выведется в консоль, так как первое услое true");
        }
    }
}