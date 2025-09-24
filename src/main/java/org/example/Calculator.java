package org.example;  // 1. Указывает, в каком «пакете» живёт класс

public class Calculator {  // 2. Объявление класса с именем Calculator

    // 3. Метод для сложения двух чисел
    public int add(int a, int b) {
        return a + b;  // 4. Возвращаем результат сложения
    }
    // Метод для вычитания двух чисел
    public int sub(int a, int b) {
        return a - b;
    }
    // Метод для умножения двух чисел
    public int mul(int a, int b) {
        return a * b;
    }
    // Метод деления двух чисел
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль запрещено");
        }
        return a / b;
    }

}
