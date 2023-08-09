public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int clientOS = 0;
        System.out.println("Задача №1");
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 0){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else {
            System.out.println("Введите корректные дынные.");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2015;
        System.out.println("\nЗадача №2");
        if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        else {
            System.out.println("Введите корректные данные.");
        }
    }

    public static void task3() {
        int year = 2021;
        System.out.println("\nЗадача №3");
        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        }
        else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int deliveryNearlyMax = 20;
        int deliveryNearlyDay = 1;
        int deliveryAverageMax = 60;
        int deliveryAverageDay = 2;
        int deliveryFarMax = 100;
        int deliveryFarDay = 3;
        System.out.println("\nЗадача №4");

        if (deliveryDistance < deliveryNearlyMax) {
            System.out.println("Потребуется дней: " + deliveryNearlyDay + ".");
        }
        else if (deliveryDistance >= deliveryNearlyMax && deliveryDistance < deliveryAverageMax) {
            System.out.println("Потребуется дней: " + deliveryAverageDay + ".");
        }
        else if (deliveryDistance <= deliveryFarMax) {
            System.out.println("Потребуется дней: " + deliveryFarDay + ".");

        }
        else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }

    public static void task5() {
        int monthNumber = 12;
        System.out.println("\nЗадача №5");
        switch (monthNumber){
            case 1:
                System.out.println("Январь"); break;
            case 2:
                System.out.println("Февраль"); break;
            case 3:
                System.out.println("Март"); break;
            case 4:
                System.out.println("Апрель"); break;
            case 5:
                System.out.println("Май"); break;
            case 6:
                System.out.println("Июнь"); break;
            case 7:
                System.out.println("Июль"); break;
            case 8:
                System.out.println("Август"); break;
            case 9:
                System.out.println("Сентябрь"); break;
            case 10:
                System.out.println("Октябрь"); break;
            case 11:
                System.out.println("Ноябрь"); break;
            case 12:
                System.out.println("Декабрь"); break;
            default:
                System.out.println("Такого месяца не существует"); break;
        }
    }
}