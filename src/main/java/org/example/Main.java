package org.example;  // указывает, что класс лежит в пакете org.example

public class Main {
    // "точка входа" в программу: с этого метода всё начинается при запуске
    public static void main(String[] args) {
        // создаём объект по чертежу Calculator
        Calculator calc = new Calculator();

        // вызываем методы
        int result = calc.add(2, 3);
        int result2 = calc.sub(10, 4);
        int result3 = calc.mul(7, 6);

        // выводим результат на экран
        System.out.println("Результат: " + result);
        System.out.println("Результат вычитания: " + result2);
        System.out.println("Результат умножения: " + result3);
        System.out.println("Деление 10 / 2: " + calc.div(10, 2));
        System.out.println("Деление 10 / 0: " + calc.div(10, 0));
gity
    }
}
