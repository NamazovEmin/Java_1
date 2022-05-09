package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        domashka1(1, 6);
        domashka2(-1);
        domashka3(-1);
        domashka4(3, "Всем привет");
        System.out.println("Год " + 300 + " является високосным?: " + domashka5(300));
    }

    public static boolean domashka1(int number1, int number2) {
        boolean result = (number1 + number2 <= 20) && (number1 + number2 >= 10);
        System.out.println(result);
        return result;

    }

    public static void domashka2(int number) {
        if (number >= 0) {
            System.out.println("Число " + number +  " положительное");

        } else {
            System.out.println("Число " + number + " отрицательное");

        }
    }

    public static boolean domashka3(int number3) {
        boolean result;
        result = number3 < 0;
        System.out.println(result);
        return result;

    }

    public static void domashka4(int number4, String line) {
        for (; number4 > 0; number4--) {
            System.out.println(line + " " + number4);
        }

    }

    public static boolean domashka5(int number5) {
        boolean result;
        if (number5 % 400 == 0) {
            result = true;
        } else {
            if (number5 % 100 == 0) {
                result = false;
            } else {
                result = number5 % 4 == 0;
            }
        }
        return result;
    }
}










