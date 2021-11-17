package Lesson3;


public class HomeWork3 {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        task4();
        System.out.println();
        task5(5, 10);
        task6();
        task7();
    }

    public static void task1() {
        int[] num = {0, 1, 1, 1, 0, 0, 1, 0, 0, 1};
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                num[i] = 0;
            } else {
                num[i] = 1;

            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }

    }

    public static void task2() {
        int[] num = new int[100];
        int y = 1;
        for (int i = 0; i < num.length; i++) {
            num[i] = y;
            y++;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void task3() {
        int[] num = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 6) {
                num[i] = num[i] * 2;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void task4() {
        int[][] table = new int[5][5];
        int y = 0;
        for (int i = 0; i < table.length; i++) {
            table[i][y] = 1;
            y++;
        }
        y = table.length - 1;
        for (int i = 0; i < table.length; i++) {
            table[i][y] = 1;
            y--;
        }
        for (int i = 0; i < table.length; i++) {
            for (y = 0; y < table.length; y++) {
                System.out.print(table[i][y]);
            }
            System.out.println();
        }
    }

    public static int[] task5(int len, int initivalValue) {
        int[] massiv = new int[len];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = initivalValue;
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
        return massiv;


    }

    public static void task6() {
        int[] maasiv = {1, 5, 20, 2, 11, 4, 30, -3, 4, 8, 41, 50};
        int max = maasiv[0];
        int min = maasiv[0];
        for (int i = 1; i <= maasiv.length - 1; i++) {
            if (max < maasiv[i]) {
                max = maasiv[i];
            }
        }
        for (int i = 1; i < maasiv.length - 1; i++) {
            if (min > maasiv[i]) {
                min = maasiv[i];
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }

    public static void task7() {
        int[] massiv = {2, 2, 2, 1, 2, 2, 10, 1};
        int sumleft = 0;
        int y = 0;
        int z = 0;
        boolean result;
        for (int i = 0; i < massiv.length - 1; i++) {
            sumleft = sumleft + massiv[i];//считая левую часть массива
            y++;// увеличиваю шаг внутреннего цикла
            int sumright = 0;// обнуляю значение для внутреннего цикла
            for (; y <= massiv.length - 1; y++) {
                z++;// счетчик итераций этого цикла, т.к. каждый раз он уменьшается на единицу
                sumright = sumright + massiv[y];// сумма правой части массива
            }
            y = y - z; //уменьшаем счетчик y на колличество итераций во внутреннем цикле for
            z = 0;//обнуляет счетчик внутреннего цикла for
            if (sumleft == sumright) {
                System.out.println(sumleft);
                System.out.println(sumright);
                // в принципе можно написать else  и поместить множество обнуление счетчиков сюда
            }
        }
    }


}
