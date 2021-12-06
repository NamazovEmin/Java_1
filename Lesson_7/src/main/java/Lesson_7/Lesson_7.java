package Lesson_7;

public class Lesson_7 {
    public static void main(String[] args) {
 /*Cat catIzy = new Cat("Изи", 55,false);
 Dish dishOne = new Dish(50);
dishOne.info();
catIzy.catEat(dishOne);
dishOne.info();*/
        Dish dishOne = new Dish(50);
        Cat arrayCat[] = new Cat[5];
        arrayCat[0] = new Cat("Изи", 5, false);
        arrayCat[1] = new Cat("Мурзик", 150, false);
        arrayCat[2] = new Cat("Барса", 10, false);
        arrayCat[3] = new Cat("Наоми", 7, true);
        arrayCat[4] = new Cat("Мася", 10, false);
        dishOne.info();
        for (int i = 0; i < arrayCat.length; i++){
            arrayCat[i].catEat(dishOne);
            dishOne.info();
        }
    }


}
