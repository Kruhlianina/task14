package lesson2;

public class Homeworks2 {
    public static void main(String[] args) {

        // Задание 1
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание  2
        int clientOS1 = 0;
        int cleentDeviceYear1 = 2020;
        switch (clientOS1) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                if (cleentDeviceYear1 > 2019) {
                    System.out.println("Установите Lite-версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                if (cleentDeviceYear1 < 2019) {
                    System.out.println("Установите Lite-версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
        }

        // Задание 3
        int year = 2024;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год не высокосный");
        }
//Задание 4
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance > 20) {
            deliveryTime++;
        }
        if (deliveryDistance > 60) {
            deliveryTime++;
        }
        System.out.println("Дней для доставки=" + deliveryTime + "+сутки");

        // Задание 5
        int monthNumbe = 12;
        switch (monthNumbe) {
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            case 12:
                System.out.println("Зимний месяц");

        }


        //Задача 6
        int age = 19;
        int salary = 58_000;
        double limit = 0;
        if (age <= 23) {
            limit = limit * 2;
        } else {
            limit = salary * 3;
        }
        if (salary > 50_000 && salary < 80_000) {
            limit = limit * 1.2;
        } else if (salary > 80_000) {
            limit = limit * 1.5;
        }
        System.out.println("Мы готовы выдать Вам кредитную карту с лимитом =" + limit + "рублей");

        //Задача 7
        int age1 = 25;
        int salary1 = 60_000;
        int wantedSum = 300_000;
        int term = 12;
        double baseState = 10;
        double maxMonthPayment = salary1 / 2;
        double monthPayment = 0;
        if (age1 < 23) {
            baseState = baseState + 1;
        } else if (age1 < 30) {
            baseState = baseState + 0.5;
        }
        if (salary1 > 80_000) {
            baseState = baseState - 0.7;
        }
        monthPayment = wantedSum * (1 + baseState / 100) / term;
        if (wantedSum * (1 + baseState / 100) > maxMonthPayment * term) {
            System.out.println("Максимальный платеж при ЗП " + salary1 + "равен" + maxMonthPayment + "рублей. Платеж по кредиту" + monthPayment);
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary1 + "равен" + maxMonthPayment + "рублей. Платеж по кредиту" + monthPayment);
        }
    }
}












