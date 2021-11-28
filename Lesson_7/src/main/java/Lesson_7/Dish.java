package Lesson_7;


public class Dish {
    private int food;

    public Dish(int food){
        this.food = food;
    }
    public void info(){
        System.out.println("Остаток еды "+ food);
    }
    public void foodIncrease(int amaunt){
        food =+ amaunt;
    }


    public boolean foodDecrease(int amaunt){
       if (( food - amaunt) < 0) {
           System.out.println("Не достаочно еды");
           return false;
       }else {
           food -= amaunt;
           return true;
       }
    }

}
