package com.geekbrains;

public class HomeWorkApp {
    public static void main(String[] args) {
        // Тестируем задачу №1
        System.out.println("=======Задача №1=======");
        for (int i = -4; i < 23; i++) {
            System.out.println("sum = " + (i + 2) + "; checkSum = " + checkSum(i, 2));
        }

        // Тестируем задачу №2
        System.out.println("=======Задача №2=======");
        for (int i = -3; i < 4; i++) {
            // так как печатается только положительное
            System.out.print("value = " + i + "; printValueSign = ");
            printValueSign(i);
        }

        // Тестируем задачу №3
        System.out.println("=======Задача №3=======");
        for (int i = -3; i < 4; i++) {
            // так как печатается только положительное
            System.out.println("value = " + i + "; isNegative = " + isNegative(i));
        }

        // Тестируем задачу №4
        System.out.println("=======Задача №4=======");
        printLines("Три раза", 3);
        printLines("Один раза", 1);
        // Не должно печатать
        printLines("Ноль раза", 0);
        printLines("Минус 1 раз", -1);

        // Тестируем задачу №5
        System.out.println("=======Задача №5=======");
        for (int i = 1890; i < 2024; i++) {
            System.out.println("year = " + i + "; isLeapYear = " + isLeapYear(i));
        }
    }

/*    1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
      (включительно), если да – вернуть true, в противном случае – false.
*/
    public static boolean checkSum(int firstValue, int secondValue) {
        int sum = firstValue + secondValue;
        return sum > 10 && sum <= 20;
    }

/*    2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
      положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
*/
    public static void printValueSign(int value) {
        if (value >= 0) {
            // можно нвывести больше данных в консоль - System.out.println("Число - " + value + " положительное");
            // В ТЗ это не раскрывается, так что пишем только знак
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

/*  3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
       отрицательное, и вернуть false если положительное.
*/
    public static boolean isNegative(int value) {
        return value < 0;
    }

/*  4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
       указанную строку, указанное количество раз;
*/
    public static void printLines(String string, int numOfLines){
        for (int i = 0; i < numOfLines; i++){
            System.out.println(string);
        }
    }

/*   5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не
        високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом
        каждый 400-й – високосный.
*/
    public static boolean isLeapYear(int year){
        if ((year % 4) > 0) {
            //точно не високосный
            return false;
        } else if ((year % 100) > 0){
            //год делится на 4, но не сотый, значит високосный
            return true;
        } else if ((year % 400) > 0){
            // год сотый, но не четырехсотый, значит не високосный
            return false;
        } else{
            // год четырехсотый значит високосный
            return true;
        }
    }
}
