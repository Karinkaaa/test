package ru.javabegin.training.syntax.var;

import java.io.IOException;
import java.math.BigDecimal;
import java.rmi.server.ExportException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        // типы данных

        /*
        int myNumber = 5;
        double d = 4.5;
        d = 3.1;
        float f = (float)1.9;
        float flo = 2.3f;
        char c  = 'f';

        String s1 = new String("String with constructor ");
        String s2 = "String without constructor";
        String s3 = s1 + s2;

        int num = 5;
        String s = "I have " + num + " cookies";
        System.out.println(s);
        System.out.println(s3);

        boolean b = false;
        b = true;

        boolean tobe = false;
        b = tobe || !tobe;

        if(b){
            System.out.println(b);
        }
        else{
            System.out.println("gadgf");
        }
        */


        // условные операторы

        /*
        int a = 4;
        int b = 5;
        boolean res;

        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b || a < b);
        System.out.println(3 < a && a < 6);
        System.out.println(!(a < b)); */

        /*int a = 4;
        int b = 3;

        if(a == b){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

        if(a != b) System.out.println("Yes !=");
        else System.out.println("No ==");
        */


        // массивы

        /*
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Length of array = " + arr.length);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
        */


        // циклы

        /*
        int i = 0;
        for (; i < 3; i++) {
            // действие
        }

        while (i < 5) {
            // действие
        }

        do {
            // действие
        } while (i < 3);

        // сокращенный foreach
        int[] arr = {2, 0, 3, 8};
        for (int el : arr) {        // эквивалентно: for(int i = 0; i < arr.length; i++)
            //System.out.println(el);
        }

        int i;
        for(i = 0; i < 5; i++){
            if(i >= 2){
                break;
            }
            System.out.println("Break");
            if(i >= 1){
                continue;
            }
            System.out.println("Continue");
        }
        */

        // задание по циклам

        /*
        int[] arr = new int[25];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 300);
        }

        for (int el : arr) {
            System.out.print(el + "\t");
        }

        System.out.println("\n" + "Even numbers:");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 237){
                continue;
            }
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + "\t");
            }
        }
        */


        // методы

        /*
        System.out.println(sum(5, 3));
        System.out.println(sum(1.5, 3.9));

        Student student = new Student();
        String name = student.getName();
        student.setName("Karina");

        System.out.println(name);

        Advice advice = new Advice();
        advice.message();
        System.out.println(advice.num());
        */


        // значения переменных

        /*
        long num = 21474836455L;
        float numFl = 5455.3f;

        int hexadecimal = 0x6F;     // перед значением 0х
        int octal = 010;            // перед значением 0
        int binary = 0b1101;        // перед значением 0b

        System.out.println("Hexadecimal = " + hexadecimal);
        System.out.println("Octal = " + octal);
        System.out.println("Binary = " + binary);

        char c = '\u0066';
        System.out.println(c);
        */


        // форматированный вывод

        /*
        int x = 5;
        int y = 8;
        System.out.printf("x = %d;\ny = %d;\n", x, y);

        String name = "Tom";
        int age = 22;
        float height = 1.74f;
        System.out.printf("Name: %s\nAge: %d\nHeight: %.2f m", name, age, height);      // .2 - два символа после точки
        */


        // ввод с консоли

        /*
        Scanner in  = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.printf("\nYour number: %d", num);
        */


        // точное значение чисел с плавающей точкой

        /*
        BigDecimal dec = new BigDecimal(1.24445142);
        System.out.println("\n\nDecimal = " + dec);
        */


        // усечение рациональных чисел до целых

        /*
        double a = 56.9897;
        int b = (int)a;

        b = (int)Math.round(a);
        System.out.println("After round: int a = " + b);

        double res = a + b;
        System.out.println("res = " + res);

        b = 'a' + 5;
        System.out.println(b + " + " + 5 + " = " + (b + 5));
        */


        // УПРАЖНЕНИЯ (условные конструкции)

        Scanner in = new Scanner(System.in);

        /* 1. Напишите консольную программу, в которой пользователь с клавиатуры вводит два числа. А программа
        сранивает два введенных числа и выводит на консоль результат сравнения (два числа равны, первое число
        больше второго или первое число меньше второго). */

        /*
        System.out.println("Enter two numbers:");
        int num = in.nextInt();
        int num2 = in.nextInt();

        if(num > num2){
            System.out.println("Number " + num + " is bigger than number " + num2);
        } else if(num < num2){
            System.out.println("Number " + num + " is less than number " + num2);
        } else{
            System.out.println("Numbers are equals");
        }
        */


        /* 2. Напишите консольную программу, в которой пользователь вводит с клавиатуры число. Если число
        одновременно меньше 9 и больше 2, то программа выводит "Число больше 5 и меньше 10". Иначе программа
        выводит сообщение "Неизвестное число". */

        /*
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if(num < 9 && num > 2){
            System.out.println("Number " + num + " is bigger than 2 and less than 10");
        } else {
            System.out.println("Unknown number!");
        }
        */


        /* 3. Напишите консольную программу, в которой пользователь вводит с клавиатуры число. Если число
        либо равно 2, либо равно 9, то программа выводит "Число либо равно 2, либо равно 9". Иначе программа
        выводит сообщение "Неизвестное число". */

        /*
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if(num == 2 || num == 9){
            System.out.println("Your number is or equals 2, or equals 9");
        } else {
            System.out.println("Unknown number!");
        }
        */


        /* 4. В банке в зависимости от суммы вклада начисляемый процент по вкладу может отличаться. Напишите
        консольную программу, в которую пользователь вводит сумму вклада. Если сумма вклада меньше 100, то
        начисляется 5%. Если сумма вклада от 100 до 200, то начисляется 7%. Если сумма вклада больше 200, то
        начисляется 10%. В конце программа должна выводить сумму вклада с начисленными процентами. */

        /*
        System.out.print("Enter the sum of deposit: ");
        double sum = in.nextDouble();

        if(sum > 200){
            sum += (sum / 100 * 10);
        } else if(sum >= 100){
            sum += (sum / 100 * 7);
        } else {
            sum += (sum / 100 * 5);
        }
        System.out.println("Sum with accrued percents = " + sum + " $");
        */


        /* 5. Напишите консольную программу, которая выводит пользователю сообщение "Введите номер операции:
        1 - сложение, 2 - вычитание, 3 - умножение". Рядом с названием каждой операции указан ее номер, например,
        операция вычитания имеет номер 2. Пусть пользователь вводит в программе номер операции и, в зависимости
        от этого номера, программа выводит название операции. Для определения операции по введенному номеру
        используйте конструкцию switch...case. Если введенное пользователем число не соответствует никакой
        операции (например, число 120), то выведите пользователю сообщение о том, что операция неопределена. */

        /*
        System.out.println("Enter the number of operation:");
        System.out.println("[1] add\n[2] subtraction\n[3] multiplication");
        int operation = in.nextInt();

        switch (operation)
        {
            case 1:
                System.out.println("This operation is ADD.");
                break;
            case 2:
                System.out.println("This operation is SUBTRACTION.");
                break;
            case 3:
                System.out.println("This operation is MULTIPLICATION.");
                break;
                default:
                    System.out.println("Operation is not found!");
        }
        */


        /* 6. Измените предыдущую программу. Пусть пользователь кроме номера операции вводит два числа, и в
        зависимости от номера операции с введенными числами выполняются определенные действия (например, при
        вводе числа 3 числа умножаются). Результат операции выводиться на консоль. */

        /*
        System.out.println("Enter two numbers:");
        int num = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Enter the number of operation:");
        System.out.println("[1] add\n[2] subtraction\n[3] multiplication");
        int operation = in.nextInt();

        switch (operation)
        {
            case 1:
                System.out.println(num + " + " + num2 + " = " + (num + num2));
                break;
            case 2:
                System.out.println(num + " - " + num2 + " = " + (num - num2));
                break;
            case 3:
                System.out.println(num + " * " + num2 + " = " + (num * num2));
                break;
            default:
                System.out.println("Operation is not found!");
        }
        */


        // УПРАЖНЕНИЯ (циклы)


        /* 1. В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек на 1000 человек,
        смертность - 8 человек. Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание,
        что показатели рождаемости и смертности постоянны. */

        /*
        int countPeople = 10000000;
        int born = 14;
        int death = 8;

        for(int i = 0; i < 10; i++){
            countPeople += (countPeople / 1000 * (born - death));
        }
        System.out.println("Count of people via 10 years will be = " + countPeople + " people.");
        */


        /* 2. В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек на 1000 человек,
        смертность - 8 человек. Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год. Рассчитайте,
        какая численность населения будет через 10 лет, учитывая, что рождаемость не может быть меньше 7 человек на
        1000 человек, а смертностность не может быть меньше 6 человек на 1000 человек. */

        /*
        int countPeople = 10000000;
        int born = 14;
        int death = 8;

        for (int i = 0; i < 10; i++) {
            if (born >= 7) {
                born--;
            }
            if (death >= 6) {
                death--;
            }
            countPeople += (countPeople / 1000 * (born - death));
        }
        System.out.println("Count of people via 10 years will be = " + countPeople + " people.");
        */


        /* 3. За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу, в которую
        пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада с учетом
        начисления процентов за каждый месяц. Для вычисления суммы с учетом процентов используйте цикл for. Пусть
        сумма вклада будет представлять тип float. */

        /*
        int percent = 7;
        System.out.print("Enter the sum of deposit: ");
        float deposit = in.nextFloat();
        System.out.print("Enter the deposit term in months: ");
        int months = in.nextInt();

        for(int i = 0; i < months; i++){
            deposit += (deposit / 100 * percent);
        }
        System.out.println("After " + months + " months sum of deposit = " + deposit + " $");
        */


        /* 4. Перепишите предыдущую программу, только вместо цикла for используйте цикл while. */

        /*
        int percent = 7;
        System.out.print("Enter the sum of deposit: ");
        float deposit = in.nextFloat();
        System.out.print("Enter the deposit term in months: ");
        int months = in.nextInt();
        int counter = months;

        while(counter-- != 0){
            deposit += (deposit / 100 * percent);
        }
        System.out.println("After " + months + " months sum of deposit = " + deposit + " $");
        */


        /* 5. Напишите программу, которая выводит на консоль таблицу умножения. */

        /*
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
        */


        /* 6. В цикле программа просит у пользователя ввести два числа и выводит результат их умножения. После
        вывода результата умножения программа спрашивает, надо ли завершить выполнение. И если пользователь
        введет число 1, то программа завершает цикл. Если введено любое другое число, то программа продолжает
        спрашивать у пользователя два числа и умножать их. */

        /*
        int answer = 0;
        int num, num2;

        do {
            System.out.println("\n\nEnter two numbers:");
            num = in.nextInt();
            num2 = in.nextInt();
            System.out.println("\n" + num + " * " + num2 + " = " + (num * num2) + "\n");
            System.out.println("Whether to complete the execution? If \"yes\" - enter 1");
            answer = in.nextInt();
        } while (answer != 1);
        */


        // зубчатый массив

        /*
        int[][] mas = new int[3][];

        for(int i = 0; i < mas.length; i++) {
            mas[i] = new int[i + 1];
        }

        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length; j++){
                mas[i][j] = i + j;
            }
        }

        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        */


        // параметры переменной длины

        /*
        System.out.println("Sum of numbers 1, 15, 6, 18, 4 = " + sum(1, 15, 6, 18, 4));
        */


        // рекурсивные функции

        /*
        System.out.println("Factorial of number 6 = " + factorial(6));
        System.out.println("Fibonachi of number 3 = " + fibonachi(3));
        */


        // обработка исключений

        /*
        try{
            int[] mas = new int[3];
            System.out.println(mas[5]);
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        int[] numbers = new int[3];
        try{
            numbers[2] = 44;
            numbers[5] = Integer.parseInt("agra");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Выход за границы массива!");
        } catch (NumberFormatException ex){
            System.out.println("Ошибка преобразования строки в число!");
        }

        try{
            int x = in.nextInt();
            if(x >= 30){
                throw new Exception("Число должно быть меньше 30");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        */

    }

    public static int sum(int... nums) {
        int sum = 0;
        for (int el : nums) {
            sum += el;
        }
        return sum;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int factorial(int x){
        if(x == 1){
            return 1;
        }
        return x * factorial(x - 1);
    }

    public  static int fibonachi(int x){
        if(x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        } else {
            return fibonachi(x - 1) + fibonachi(x - 2);
        }

    }
}
