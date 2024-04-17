import java.time.Year;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Задание 2");
        int clientDeviceYear = 2016;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установить облегченную версию iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите современную версию iOS по ссылке");
        }
        System.out.println("Задание 3");
        int year = 2080;
        if (year % 400 == 0 || year % 4 == 0) {
            System.out.println("" + year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println("" + year + " год не является високосным");
        } else if (year < 1584) {
            System.out.println("" + year + " год не является високосным");
        } else if (year % 400 != 0 || year % 4 != 0) {
            System.out.println("" + year + " год не является високосным");
        }

        System.out.println("Задание 4");
        int deliveryDistance = 100;
        int day = 1;
        if (deliveryDistance > 100)
        {
            System.out.println("Не доставляется.");
        } else {
            if (deliveryDistance >= 20) {
                day++;
            }
            if (deliveryDistance >= 60) {
                day++;
            }
            System.out.println("Доставка занимает: " + day);
        }
        System.out.println("Задание 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}

