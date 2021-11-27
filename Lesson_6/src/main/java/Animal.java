public class Animal {
    protected String name;
    int number = 0;

    public  Animal(String name){
        this.name = name;
        temp();
        System.out.println("Создано " + number + " обектов класса Animal");

    }


public  void temp(){
        number++;


}
    public void Run(int lenght){
        System.out.println(name + " пробежал " + lenght + " метров");
    }

    public void Sweem(int lenght){
        System.out.println(name + " проплыл " + lenght + " метров");
    }
}
