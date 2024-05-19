
public class Main {
    public static void main(String[] args) {
        //задание 1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
        //задание 2
        int clientOS1 = 0;
        int clientDeviceYear = 2016;
        if (clientOS1 == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear > 2015)
            System.out.println("Установите версию приложения для Android по ссылке");
        if (clientOS1 == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else if (clientOS1 == 0 && clientDeviceYear <= 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
// задание 3
        int year = 2000;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || (year > 1584 && year%400==0)) {
            System.out.println(year + " " + "год является високосным");
        }else{
            System.out.println(year + " " + "год является не високосным");
        }
        //задание 4
        int deliveryDistance = 20;
//каждые доп 40 км + 1 день
        if(deliveryDistance<=20){
            System.out.println("Потребуется дней:1");
        }else if (deliveryDistance>20 && deliveryDistance<60) {
            System.out.println("Потребуется дней:2");
        }else if (deliveryDistance>=60 && deliveryDistance<=100) {
            System.out.println("Потребуется дней:3");
        }else if(deliveryDistance>100) {
            System.out.println("доставки нет.");
        }
        //задание 5 switch
        int monthNumber =3;
        switch (monthNumber) {
            case 1:
                System.out.println("январь-зима");
                break;
            case 2:
                System.out.println("февраль-зима");
                break;
            case 3:
                System.out.println("март - весна");
                break;
            case 4:
                System.out.println("апрель- весна");
                break;
            case 5:
                System.out.println("май - весна");
                break;
            case 6:
                System.out.println("июнь -лето");
                break;
            case 7:
                System.out.println("июль-лето");
                break;
            case 8:
                System.out.println("август - лето");
                break;
            case 9:
                System.out.println("сентябрь- осень");
                break;
            case 10:
                System.out.println("октябрь - осень");
                break;
            case 11:
                System.out.println("ноябрь - осень");
                break;
            case 12:
                System.out.println("декабрь- зима");
                break;

            default:
                System.out.println("неверно указан месяц.");
        }











    }
}


