import java.util.Random;
import java.util.Scanner;

public class CrossAndZero {
    private static final int SIZE = 3;
    public static char[][] MAP;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initMAP();
        printMAP();
        while(true){
            aiGO();
            printMAP();
            if (checkWin()){
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            userGO();
            printMAP();
            if (checkWin()){
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

        System.out.println("Спасибо за игру!");

    }


    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
    if (MAP[i][j] == DOT_EMPTY) {
        return false;

    }
            }
        }
        return true;
    }

    public static void userGO() {
        int x, y;
        do {
            System.out.println("Ход игрока. Сначала задайте вертикальную координату, а потом горизонтальную");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }while (isCellValid(x, y));
        MAP[x-1][y-1] = DOT_X;
    }

    public static void aiGO() {
        int x, y;
        do {
            x = random.nextInt(SIZE)+1;
            y = random.nextInt(SIZE)+1;
            System.out.println(y);
            System.out.println(x);

        } while (isCellValid(x, y));
        MAP[x-1][y-1] = DOT_O;
    }


    public static boolean checkWin() {

        for (int i = 0; i < SIZE; i++) {     //проверка горизонталей
            int countUser = 0;
            int countAI = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_X) {
                    countUser = countUser +1;
                }
                if (MAP[i][j] == DOT_O) {
                    countAI = countAI +1;
                }
                if (countUser == SIZE){
                    System.out.println("Люди победили");
                    return true;
                }
                if (countAI == SIZE){
                    System.out.println("Компьютор победил");
                    return true;
                }
                }
            }

        for (int i = 0; i < SIZE; i++) {    //проверка вертикалей
            int countUser = 0;
            int countAI = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[j][i] == DOT_X) {
                    countUser = countUser +1;
                }
                if (MAP[j][i] == DOT_O) {
                    countAI = countAI +1;
                }
                if (countUser == SIZE){
                    System.out.println("Люди победили");
                    return true;
                }
                if (countAI == SIZE){
                    System.out.println("Компьютор победил");
                    return true;
                }
            }
        }
        int countUser = 0;   //проверка диаганали сверху вниз
        int countAI = 0;
        int j = 0;
        for (int i = 0; i < SIZE; i++) {

            if (MAP[i][j] == DOT_X) {
                countUser = countUser +1;
            }
            if (MAP[i][j] == DOT_O) {
                countAI = countAI +1;
            }
            if (countUser == SIZE){
                System.out.println("Люди победили");
                return true;
            }
            if (countAI == SIZE){
                System.out.println("Компьютор победил");
                return true;
            }
                j++;
            }
        countUser = 0;//проверка диаганали снизу вверх
        countAI = 0;
        j = 2;
        for (int i = 0; i < SIZE; i++) {

            if (MAP[i][j] == DOT_X) {
                countUser = countUser +1;
            }
            if (MAP[i][j] == DOT_O) {
                countAI = countAI +1;
            }
            if (countUser == SIZE){
                System.out.println("Люди победили");
                return true;

            }
            if (countAI == SIZE){
                System.out.println("Компьютор победил");
                return true;
            }
            j--;
        }
        return false;
        }

    public static boolean isCellValid(int x, int y){

    if (x < 1 || x > SIZE || y < 1 || y > SIZE){
        System.out.println("Заданы не верные координаты");
        return true;
    }
    if (MAP[x-1][y-1] != DOT_EMPTY){
        System.out.println("Клетка уже занята, попробуйте сходить в другую клетку");
        return true;
    }
   return false;

}

    public static void printMAP() {
        System.out.print(" ");
        for (int i = 0; i < SIZE; i++ ) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1);
            for (int j = 0; j < SIZE; j++){
                System.out.print(" " + MAP[i][j]);
            }
            System.out.println();

        }
    }

    public static void initMAP() {
       MAP = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                MAP[i][j] = DOT_EMPTY;

        }
    }
}



