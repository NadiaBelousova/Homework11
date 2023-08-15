import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        //введите год;
        int year = 2021;
        leapYear(year);

    }

    public static void printSetupOperationSystem(int operationSystem, int yearOfIssue) {
        if (operationSystem == 1 && yearOfIssue >= 2015) {
            System.out.println("Установите версию для IOS по ссылке");
        } else if (operationSystem == 1) {
            System.out.println("Установите обегченную версию приложения для IOS по ссылке");
        } else if (operationSystem == 0 && yearOfIssue >= 2015) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (operationSystem == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если Ваша операционная система IOS введите 1, если Android - введите 0.");
        int operationSystem = Integer.parseInt(scanner.next());
        System.out.println("Введите год выпуска устройства");
        int yearOfIssue = Integer.parseInt(scanner.next());
        printSetupOperationSystem(operationSystem, yearOfIssue);
    }

    public static int calculateTime(int distanceOfDelivery) {
        int days = 1;
        int daysOfDelivery = 0;
        if (distanceOfDelivery <= 20) {
            return 1;
        } else if (distanceOfDelivery <= 60) {
            return 2;
        } else if ( distanceOfDelivery <= 100) {
            return 3;
        } else {
            return -1;
        }
    }


            public static void task3 () {
                System.out.println("Задача 2");
                Scanner scanner=new Scanner(System.in);
                System.out.println("Введите расстояние от офиса до адреса доставки");
                int distanceOfDelivery= Integer.parseInt(scanner.next());
                int finalDaysOfDelivery = calculateTime(distanceOfDelivery);
                if (finalDaysOfDelivery == -1) {
                    System.out.println("доставки нет");
                } else {
                    System.out.println("Время доставки: " + finalDaysOfDelivery + " дней");
                }

            }
        }

