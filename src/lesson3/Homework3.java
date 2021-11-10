package lesson3;
public class Homework3 {
    public static void main(String[] args) {
        //Задание 1
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        System.out.println(" ");
        int i2 = 10;
        while (i2 >= 1) {
            System.out.print(" " + i2);
            i2--;
        }
        System.out.println(" ");

        //Задание 2
        for (int dayNumber = 1; dayNumber <= 31; dayNumber = dayNumber + 7) {

            System.out.println("Пятница Подготовить еженедельный отчет " + dayNumber);

        }
        //Задание 3
        int currentYer = 2021;
        int minYer = currentYer - 200;
        int maxYer = currentYer + 79;
        for (int year = minYer; year <= maxYer; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

        //Задание 4
        for (int number = 1; number <= 30; number++) {
            if (number % 3 == 0) {
                System.out.println("Ping " + number);

            }
        }
        for (int numberFive = 1; numberFive <= 30; numberFive++) {
            if (numberFive % 5 == 0) {
                System.out.println("Pong " + numberFive);
            }
        }
        for (int number35 = 1; number35 <= 30; number35++) {
            if (number35 % 3 == 0 && number35 % 5 == 0) {
                System.out.println("Ping pong " + number35);
            }
        }

        //Задача 5

        int variable0 = 0;
        int variable1 = 1;
        int variable2;
        System.out.print("Последовательность Фибоначчи "+variable0+ " " + variable1+ " ");
        for (int i1 = 3; i1 <= 10; i1++) {
            variable2 = variable0 + variable1;
            System.out.print(variable2 + " ");
            variable0 = variable1;
            variable1 = variable2;
        }
        System.out.println(" ");
        }
    }






