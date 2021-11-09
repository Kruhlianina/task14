package com.company.Lesson1;

public class Homework1 {
    public static void main(String[] args) {
        // Задача 1
        byte a = 10;
        short b = 521;
        int c = 65;
        long d = 45685L;
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
        float weightSum = boxer1 + boxer2;
        float weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес двух бойцов, кг =" + weightSum);
        System.out.println("Разница между весами бойцов, кг =" + weightDifference);

        // Задача 3
        int banana = 5;
        int milk = 105;
        int iceCream = 2;
        int egg = 4;
        int weightBanana = banana * 80;
        int weightMilk = milk + 105;
        int weightIceCream = iceCream * 100;
        int weightEgg = egg * 70;
        int weightSum1 = weightBanana + weightMilk + weightIceCream + weightEgg;
        float gramsPerKilogram = 1000f;
        float weightKilogram = weightSum1 / gramsPerKilogram;
        System.out.println("Количество грамм спорт-завтрака =" + weightSum1);
        System.out.println("Количество килограмм спорт-завтрака =" + weightKilogram);

        // Задача 4
        int loseWeight = 7;
        int gramDay1 = 250;
        int gramDay2 = 500;
        float gramsPerKilogram1 = 1000f;
        float loseWeightGrams = loseWeight * gramsPerKilogram1;
        float daysToLoseWeight1 = loseWeightGrams / gramDay1;
        float loseWeightGrams2 = loseWeightGrams / gramDay2;
        System.out.println("При потери 250 гр в день, уйдет дней =" + daysToLoseWeight1);
        System.out.println("При потери 500 гр в день, уйдет дней =" + loseWeightGrams2);

        // Задача 5
        int mashaRuble = 67760;
        int denisRruble = 83690;
        int krisRuble = 76230;
        int percentRise = 10;
        int percent = 100;
        int salaryMasha = mashaRuble * percentRise / percent;
        int salaryDenis = denisRruble * percentRise / percent;
        int salaryKris = krisRuble * percentRise / percent;
        int salaryYearUpMasha = (mashaRuble + salaryMasha);
        int salaryYearUpDenis = (denisRruble + salaryDenis);
        int salaryYearUpKris = (krisRuble + salaryKris);
        int differenceMasha = salaryMasha * 12;
        int differenceDenis = salaryDenis * 12;
        int differenceKris = salaryKris * 12;
        System.out.println ("Маша теперь получает, руб =" + salaryYearUpMasha);
        System.out.println ("Годовой доход Маши вырос на, руб =" + differenceMasha);
        System.out.println("Денис теперь получает, руб =" + salaryYearUpDenis);
        System.out.println("Годовой доход Дениса вырос на, руб =" + differenceDenis);
        System.out.println("Кристина теперь получает, руб =" + salaryYearUpKris);
        System.out.println("Годовой доход Кристины вырос на, руб =" + differenceKris);

        //Задача 6
        int a1 = 12;
        int b1 = 27;
        int c1 = 44;
        int d1 = 15;
        int e1 = 9;
        int result = a1*(b1+(c1-d1*e1));
        var result2 = -result;
        System.out.println("Функция1 =" +result);
        System.out.println("Функция2 =" +result2);

        //Задача 7
        int a2 =5;
        int b2 = 7;
        a2 = a2 + b2;
        b2 = a2 - b2;
        a2 = a2 - b2;
        System.out.println ("a2 = " +a2);
        System.out.println ("b2 = " + b2);

        //Задача 8
        int a3 = 542;
        int c3 = a3 / 10;
        int b3 = c3 % 10;
        System.out.println("b3 = " + b3);
    }


}

