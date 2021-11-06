package com.company.Lesson1;

public class Homework1 {
    public static void main(String[] args) {
        // Задача 1
        byte a = 10;
        short b = 521;
        int c = 65;
        long d = 45685;
        float e = 56.38f;
        double f = 89.26;
        char g = 654;
        boolean h = d > b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // Задача 2
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float weight1 = boxer1 + boxer2;
        float weight2 = boxer2 - boxer1;
        System.out.println("Общий вес двух бойцов, кг =" + weight1);
        System.out.println("Разница между весами бойцов, кг =" + weight2);

        // Задача 3
        int banana = 5;
        int milk = 105;
        int iceCream = 2;
        int egg = 4;
        int res1 = banana * 80;
        int res2 = milk + 105;
        int res3 = iceCream * 100;
        int res4 = egg * 70;
        int res5 = res1 + res2 + res3 + res4;
        float res6 = res5 / 1000f;
        System.out.println("Количество грамм спорт-завтрака =" + res5);
        System.out.println("Количество килограмм спорт-завтрака =" + res6);

        // Задача 4
        int gramday1a = 70000;
        int gramday2a = 250;
        int otvet1 = gramday1a / gramday2a;
        int gramday1b = 70000;
        int gramday2b = 500;
        int otvet2 = gramday1b / gramday2b;
        System.out.println("При потери 250 гр в день, уйдет дней =" + otvet1);
        System.out.println("При потери 500 гр в день, уйдет дней =" + otvet2);

        // Задача 5
        int masharuble = 67760;
        int denisruble = 83690;
        int krisruble = 76230;
        int percentrise = 10;
        int percent = 100;
        int zarplataMasha = masharuble * percentrise / percent;
        int zarplataDenis = denisruble * percentrise / percent;
        int zarplataKris = krisruble * percentrise / percent;
        int zarplataYearMasha = masharuble * 12;
        int zarplataYearDenis = denisruble * 12;
        int zarplataYearKris = krisruble * 12;
        int zarplataYearUpMasha = (masharuble + zarplataMasha) * 12;
        int zarplataYearUpDenis = (denisruble + zarplataDenis) * 12;
        int zarplataYearUpKris = (krisruble + zarplataKris) * 12;
        int differenceMasha = zarplataYearUpMasha - zarplataYearMasha;
        int differenceDenis = zarplataYearUpDenis - zarplataYearDenis;
        int differenceKris = zarplataYearUpKris - zarplataYearKris;
        System.out.println("+10% к з/п Маши в месяц, руб =" + zarplataMasha);
        System.out.println("+10% к з/п Дениса, руб =" + zarplataDenis);
        System.out.println("+10% к з/п Кристины, руб =" + zarplataKris);
        System.out.println("З/п Маши в год без повышения, руб =" + zarplataYearMasha);
        System.out.println("З/п Дениса в год без повышения, руб =" + zarplataYearDenis);
        System.out.println("З/п Кристины в год без повышения, руб =" + zarplataYearKris);
        System.out.println("Маша теперь получает, руб =" + zarplataYearUpMasha);
        System.out.println("Денис теперь получает, руб =" + zarplataYearUpDenis);
        System.out.println("Кристина теперь получает, руб =" + zarplataYearUpKris);
        System.out.println("Годовой доход Маши вырос на, руб =" + differenceMasha);
        System.out.println("Годовой доход Дениса вырос на, руб =" + differenceDenis);
        System.out.println("Годовой доход Кристины вырос на, руб =" + differenceKris);

        //Задача 6
        int a1 = 12;
        int b1 = 27;
        int c1 = 44;
        int d1 = 15;
        int e1 = 9;
        int result = a1*(b1+(c1-d1*e1));
        var result2 = -result;
        var number = Math.abs(result2);
        var result3 = -result;
        var number1 = Math.abs(result3);
        var result4 = result;
        var number2 = Math.abs(result4);
        System.out.println("Функция1 =" +result);
        System.out.println("Функция2 =" +result2);
        System.out.println("Функция3 =" +result3);
        System.out.println("Функция4 =" +result4);

        //Задача 7
        int a2 =5;
        a2 = 7;
        int b2 = 7;
        b2 = 5;
        System.out.println("a2 = " + a2 +", b2 = " + b2);

        //Задача 8
        int a3 = 542;
        int c3 = a3 / 10;
        int b3 = c3%10;
        System.out.println("b3 = " + b3);
    }


}

