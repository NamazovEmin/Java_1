public class Dog extends Animal{
 public Dog(String name){
     super(name);
     System.out.println("Создано " + number + " обектов класса Dog");

 }

    @Override
    public void Sweem(int lenght) {
     if (lenght <= 10) {
         super.Sweem(lenght);
     }else {
         System.out.println(name + " не может проплыть больше 10 метров");
     }
    }

    @Override
    public void Run(int lenght) {
        if (lenght <= 500) {
            super.Run(lenght);
        }else{
            System.out.println(name + " не может пробежать больше 500 метров");
        }
    }
}
