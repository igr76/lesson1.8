import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //високостный год
        System.out.println("Введите год: ");
        int yearnumber = sc.nextInt();
        yearCalculate(yearnumber);
        //тип операционной системы
        System.out.println("Введите тип операционной ситемы IOS-0, Android-1 : ");
        int clientOS = sc.nextInt();
        System.out.println("Введите год выпуска: ");
        int clientDeviceYear = sc.nextInt();
        oS(clientOS,clientDeviceYear);
        //доставка катры банка
        System.out.println("Сколько километров вы живете от банка: ");
        int deliveryDistance = sc.nextInt();
        delivery(deliveryDistance);
    }


    // високостный год
    public static void yearCalculate(int year){
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 > 0) || (year %400 ==0 ));
        if (isLeapYear ) {
            System.out.println(year + "год високостный");
        }    else
            System.out.println(year + "год не високостный");

    }
    //операционная система

    public static void oS(int clientOS , int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean isClientOS = clientOS == 0;
        if (isClientOS) {
            if (clientDeviceYear >= currentYear - 1) {

                System.out.println(" Установите версию приложения для IOS по ссылке");
            } else
                System.out.println(" Установите облегченную " +
                        "версию приложения для IOS по ссылке");
        } else if (clientDeviceYear >= currentYear - 1) {
            System.out.println(" Установите версию приложения для IOS по ссылке");
        } else
            System.out.println("Установите облегченную версию " +
                    "приложения для Android по ссылке");
    }
    //доставка катры банка
    public static void delivery(int deliveryDistance){
        if (deliveryDistance>100) {
            System.out.println("вы живете слишком далеко, свяжитесь с банком");
            return;
        }
        if (deliveryDistance<=20) {
            System.out.println("карта будет доставлена в течении суток");
        }else if (deliveryDistance>20&&deliveryDistance<60) {
            System.out.println("карта будет доставлена в течении двух суток");
        } else System.out.println("карта будет доставлена в течении трех суток");

    }



}