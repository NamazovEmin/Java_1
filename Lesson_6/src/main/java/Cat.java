public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        System.out.println("Создано " + number + " обектов класса Cat");

    }


    @Override
    public void Sweem(int lenght) {
        System.out.println("Изивините, " + name + " не умеет плавать");
    }

    @Override
    public void Run(int lenght) {
        if (lenght <= 200){
            super.Run(lenght);
        }else{
            System.out.println(name + " не может пробежать больше 200 метров");

        }

    }
}
