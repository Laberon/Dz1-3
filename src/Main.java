public class Main {
    public static void main(String[] args) {
        {System.out.println("Задание 1");}
        int cliensOs = 1;
        if (cliensOs <= 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (cliensOs > 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        {System.out.println("Задание 2");}
        int clientDeviceYear = 2015;
        if (cliensOs<=0 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (cliensOs <= 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (cliensOs > 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылк");
        } else if (cliensOs > 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        {System.out.println("Задание 3");}
        int year=2024;
        boolean laepYear=((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (laepYear) {
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+" год не является високосным");
        }

        {System.out.println("Задание 4");}
        char deliveryDistance = 101;
        int deliverDay=1;
        if (deliveryDistance<=20){
            System.out.println("Потребуется "+deliverDay+" день");
        } else if (deliveryDistance >20 && deliveryDistance <60) {
            System.out.println("Потребуется "+deliverDay*2+" дня");
        } else if (deliveryDistance >60 && deliveryDistance <100) {
            System.out.println("Потребуется "+deliverDay*3+" дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Потребуется "+deliverDay*4+" дня");
        }

        {System.out.println("Задание 5");}
        int monthNumber = 8;
        String mounth;
        switch (monthNumber){
            case 12:
                mounth="декабрь";
            case 1:
                mounth="январь";
            case 2:
                mounth="февраль";
                System.out.println(monthNumber+" месяц он же "+mounth+" принадлежит к сезону зима");
                break;
            case 3:
                mounth="март";
            case 4:
                mounth="апрель";
            case 5:
                mounth="май";
                System.out.println(monthNumber+" месяц он же "+mounth+" принадлежит к сезону весна");
                break;
            case 6:
                mounth="июнь";
            case 7:
                mounth="июль";
            case 8:
                mounth="август";
                System.out.println(monthNumber+" месяц он же "+mounth+" принадлежит к сезону лето");
                break;
            case 9:
                mounth="сентябрь";
            case 10:
                mounth="октябрь";
            case 11:
                mounth="ноябрь";
                System.out.println(monthNumber+" месяц он же "+mounth+" принадлежит к сезону осень");
                break;
            default:
                System.out.println("Упс, такого месяца на нашей планете нет!");
        }

        /*
        {System.out.println("Задание 6");}
        int age=19;
        int salary=58_000;
        switch (salary){
        case 1:
            age>=23
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+salary*3);


        if (age>=23){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+salary*3);
        }else if (salary>=50_000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+salary*1.2);
        }
        if (age<23) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2);
        } else if (salary < 50_000) {
            System.out.println("Мы не готовы выдать вам кредитную карту ");
        }
        if (salary>=80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 1.5);
        }
        */


            //System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+ salary*3*1.2);
        //} else if (age<23 && salary<50_000) {
        //    System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+salary*2);
        //}
        //boolean laepYear=((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))

    }
}