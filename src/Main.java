public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        }
    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2016;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.printf("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.printf("Установите облегченную версию приложения iOS по ссылке");
        }
        }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2024;
        if (year%4!=0||year%100==0&&year%400!=0){
            System.out.println("год  не является високосным");}
        else {
            System.out.println ("год  является високосным");}
        }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 105;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка за сутки");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Доставка за двое суток");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Доставка за трое");
        } else if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
    public static void task5() {
            System.out.println("Задача 5");
      int monthNumber = 11;
      switch (monthNumber){
          case 1:
          case 2:
          case 12:
              System.out.println("зима");
              break;
          case 3:
          case 4:
          case 5:
              System.out.println("весна");
              break;
          case 6:
          case 7:
          case 8:
              System.out.println("лето");
              break;
          case 9:
          case 10:
          case 11:
              System.out.println("осень");
      }

    }
    }




